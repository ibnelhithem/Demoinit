package mobiletest;

import com.shaft.cli.FileActions;
import com.shaft.driver.DriverFactory;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    public WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("mobile_app", FileActions.getAbsolutePath("src/test/resources/testDataFiles/", "app-release.apk"));
        //System.setProperty("browserStack.appUrl", FileActions.getAbsolutePath("src/test/resources/testDataFiles/", "app-release.apk"));
        driver = DriverFactory.getDriver();
    }
    @AfterMethod
    public void afterMethod(){
        DriverFactory.closeAllDrivers();
    }
}
