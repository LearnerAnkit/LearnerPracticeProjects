package WebPages;

/**
 * Created by ExtremeExpert on 1/25/2016.
 */
public class LoginPage extends PageObjects.LoginPage {

public static void enterUsername(String Username){

    PageObjects
            .LoginPage
            .userName()
            .sendKeys(Username);
}


}
