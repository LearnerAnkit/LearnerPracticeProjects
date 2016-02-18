package Configurations; /**
 * Created by ExtremeExpert on 1/25/2016.
 *
 */

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverFactory extends WebBrowser {

   public static WebDriver driver;

   public static void initiateDriver(String ApplicationURL){

      driver = WebBrowser.initWebBrowser(Browsers.Firefox, driver);
      driver.get(ApplicationURL);
   }

}
