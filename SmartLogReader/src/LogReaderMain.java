import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;
import opennlp.tools.sentdetect.SentenceSampleStream;
import opennlp.tools.util.InputStreamFactory;
import opennlp.tools.util.MarkableFileInputStreamFactory;
import opennlp.tools.util.PlainTextByLineStream;
import opennlp.tools.util.Span;
import opennlp.tools.util.TrainingParameters;

import java.util.Scanner;

public class LogReaderMain extends LogReportCreator {
	
	 public void trainSentDectectModel() throws IOException {
         // directory to save the model file that is to be generated, create this directory in prior
         File destDir = new File(Configurations.destinationDirectory);
  
         // training data
         InputStreamFactory in = new MarkableFileInputStreamFactory(new File(Configurations.trainingDataSource));
  
         // parameters used by machine learning algorithm, Maxent, to train its weights
         TrainingParameters mlParams = new TrainingParameters();
         mlParams.put(TrainingParameters.ITERATIONS_PARAM, Integer.toString(15));
         mlParams.put(TrainingParameters.CUTOFF_PARAM, Integer.toString(1));
  
         // train the model
         SentenceModel sentdetectModel = SentenceDetectorME.train("en", new SentenceSampleStream(new PlainTextByLineStream(in, StandardCharsets.UTF_8)), true, null, mlParams );
  
         // save the model, to a file, "en-sent-custom.bin", in the destDir : "custom_models"
         File outFile = new File(destDir,"en-sent-custom.bin"); 
         FileOutputStream outFileStream = new FileOutputStream(outFile); 
         sentdetectModel.serialize(outFileStream);  
  
         // loading the model
         SentenceDetectorME sentDetector = new SentenceDetectorME(sentdetectModel); 
         
         File dir = new File(Configurations.fileToRunAgainst);
         File[] directoryListing = dir.listFiles(new FilenameFilter() {
        	    public boolean accept(File dir, String name) {
        	     return name.toLowerCase().endsWith(".txt");
        	    }
        	});
        
         if (directoryListing != null)  {
        	 
           for (File child : directoryListing)  {
        
         //detecting sentences in the test string
         String content = new Scanner(child).useDelimiter("\\Z").next();
         String childName = child.getName();
         String testString = (content);
         String[] sents = sentDetector.sentDetect(testString);
         System.out.println("Name:"+childName);
         System.out.println("---------Sentences Detected by the SentenceDetector ME class using the generated model-------");
        
         for(int i=0;i<sents.length;i++)
         {        	 
        	 if(sents[i].contains("Select"))
        	 {        		 
        	 System.out.println("Sentence "+(i+1)+" : "+sents[i]);	 
          	 }
          }	
             LogReportCreator.excelReporter(sents);
           }
         }
         else
         {
           // Handle the case where dir is not really a directory.
           // Checking dir.isDirectory() above would not be sufficient
           // to avoid race conditions with another process that deletes
           // directories.
         }
 }
	
	   public static void main(String args[]) throws Exception
	   { 
		   try 
		   {
	            new LogReaderMain().trainSentDectectModel();
	        } 
		   catch (IOException e)
		   {
	            e.printStackTrace();
	        }
		} 
	}


