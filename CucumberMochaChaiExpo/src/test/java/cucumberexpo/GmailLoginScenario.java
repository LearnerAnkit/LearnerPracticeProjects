package cucumberexpo;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


/**
 * Created by ExtremeExpert on 7/23/2016.
 */
public class GmailLoginScenario {

    WebDriver driver;
    WebDriverWait wait;
    @Before
    public void setUp(){

        driver = new FirefoxDriver();
       wait = new WebDriverWait(driver,60);

    }

    @After
    public void tearDown(){

        driver.quit();
    }

    @Given("^The gmail login page is loaded$")
    public void loadGmailPage(){

        driver.get("https://www.gmail.com");
       /* wait.until(ExpectedConditions.presenceOfElementLocated((By.linkText("Sign in"))));
        driver.findElement(By.linkText("Sign in")).click();*/
    }

    @When("^User enters the credentials$")
    public void enterCredentials(){

        driver.findElement(By.id("Email")).sendKeys("");
        driver.findElement(By.id("next")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(((By.id("Passwd")))));
        driver.findElement(By.id("Passwd")).sendKeys("");
        driver.findElement(By.id("signIn")).click();
    }

    @Then("^User logs into Gmail$")
    public void loggedIn(){
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        Assert.assertTrue(driver.getTitle().contentEquals(""));

    }
}
