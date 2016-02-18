package Tests

import Configurations.DriverFactory
import WebPages.LoginPage
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
    @org.testng.annotations.BeforeTest

    public static void setUp(){

     DriverFactory.initiateDriver("https://www.gmail.com")

    }

    @Test
    public static void "Verifying Login to Gmail App"(){


        LoginPage.enterUsername("ankitphalniker@gmail.com")
    }

    @AfterTest
    public static void terminate(){


    }
}
