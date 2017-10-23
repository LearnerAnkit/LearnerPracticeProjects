	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;


public class LogReportCreator {
	
	public static  void excelReporter(String[] error) {
	
		 final String FILE_NAME = "A:\\Softwares\\logs\\MyFirstExcel.xlsx";

		        XSSFWorkbook workbook = new XSSFWorkbook();
		        XSSFSheet sheet = workbook.createSheet("Erros in Hourly Log File");
		        Object[][] datatypes = {
		                {"Errors"},
		                {error} };
                String[] datatypes1 = error;
		        int rowNum = 1;
		        
		        for (String datatype1 : datatypes1) {
		            Row row = sheet.createRow(rowNum++);
		            int colNum = 0;
		                Cell cell = row.createCell(colNum++);
		                if (datatype1 instanceof String) {
		                    cell.setCellValue(datatype1);
		                } else  {
		                    cell.setCellValue(Integer.parseInt(datatype1));
		                }
		            }
		        

		        try {
		            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
		            workbook.write(outputStream);
		            workbook.close();
		        } catch (FileNotFoundException e) {
		            e.printStackTrace();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }

		        System.out.println("Done");
		    }
			
	
	   }
	
	
	   
	
