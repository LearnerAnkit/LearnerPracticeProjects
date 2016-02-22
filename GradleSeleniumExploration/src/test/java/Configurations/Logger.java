package Configurations;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

/**
 * Created by ExtremeExpert on 2/23/2016.
 */
public class Logger {



public static ExtentTest init() {

     ExtentReports logger = new ExtentReports(".//resources//Test_Report.htm");
     ExtentTest testlogger = logger.startTest("Regression Test Suite");

     return testlogger;
  }
}
