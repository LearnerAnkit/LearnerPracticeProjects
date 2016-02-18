package Configurations; /**
 * Created by ExtremeExpert on 1/25/2016.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class WebBrowser {

   Browsers browser;

    enum Browsers {

        Firefox,
        InternetExplorer,
        Chrome;
    }

    public static WebDriver initWebBrowser(Browsers browser, WebDriver driver){

        switch(browser) {

            case Firefox:

                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                return driver;

            case InternetExplorer:

                System.setProperty("webdriver.ie.driver", "C:\\Users\\ExtremeExpert\\.gradle\\caches\\modules-2\\files-2.1\\org.seleniumhq.selenium\\selenium-ie-driver\\2.49.1\\bc963788e9e626f47fd55180ad10f057d00be398\\selenium-ie-driver-2.49.1.jar");
                driver = new InternetExplorerDriver();
                return driver;

            case Chrome:

                System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
                driver = new ChromeDriver();
                return driver;
        }

        return driver;
    }


}
