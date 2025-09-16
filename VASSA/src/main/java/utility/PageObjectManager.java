package utility;

import org.openqa.selenium.WebDriver;
import pageobject.LoginPage;

public class PageObjectManager {
    WebDriver driver;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage getLoginPage(){
        LoginPage loginpage = new LoginPage(driver);
        return loginpage;
    }
}
