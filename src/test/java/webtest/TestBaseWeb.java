package webtest;

import com.shaft.cli.FileActions;
import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBaseWeb{

    public WebDriver driver;
    By cokkie = By.xpath("//a/span[contains(text(), \"Continue to Site\")]");
    @BeforeMethod
    public void beforeMethod(){
        driver = DriverFactory.getDriver();
        BrowserActions.navigateToURL(driver,"https://bulbapedia.bulbagarden.net/wiki/Main_Page");
        (new ElementActions(driver)).click(cokkie);
    }
    @AfterMethod
    public void afterMethod(){
        DriverFactory.closeAllDrivers();
    }
}