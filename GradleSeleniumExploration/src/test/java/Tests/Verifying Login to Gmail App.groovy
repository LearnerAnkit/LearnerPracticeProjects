package Tests

import Configurations.DriverFactory
import Configurations.Logger
import WebPages.LoginPage
import com.relevantcodes.extentreports.ExtentTest
import com.relevantcodes.extentreports.LogStatus
import org.junit.BeforeClass
import org.testng.*
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeMethod
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test

/**
 * Created by ExtremeExpert on 1/26/2016.
 */
class Verifying extends LoginPage
{
    static ExtentTest report= Logger.init()

    @org.testng.annotations.BeforeTest

    public static void setUp(){

     DriverFactory.initiateDriver("https://www.gmail.com")
     report.log(LogStatus.PASS,"Gmail Opened","Gmail Opened")

    }

    @Test
    public static void "Verifying Login to Gmail App"(){

        LoginPage.enterUsername("")
    }

    @AfterTest
    public static void terminate(){


    }
}
