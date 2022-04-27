package mobile;

import com.shaft.driver.ShaftDriver;
import com.shaft.driver.DriverFactory;
import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import com.shaft.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class Home extends Base{

    private By Register = By.xpath("//*[contains(@content-desc,'Register')]");
    private By Rooms = By.xpath("//*[contains(@content-desc,'Rooms')]");
    private By Info = By.xpath("//*[contains(@content-desc,'Info')]");
    private By Welcome = By.xpath("//*[contains(@content-desc,'Welcome to intive')]");
    private By Town = By.xpath("//*[contains(@content-desc,'Regensburg')]");
    private By DateVisit = By.xpath("//*[contains(@content-desc,'Tomorrow')]");
    private By SendEmail = By.xpath("//*[contains(@content-desc,'Send registration email')]");

    public Home(WebDriver driver){
        super(driver);
    }
    public Home registerNavigation(){
        ElementActions.click(driver, Register);
        System.out.println(ElementActions.getAttribute(driver,Welcome,"displayed")+"Hassan");
        Assert.assertEquals(ElementActions.getAttribute(driver,Welcome,"displayed"),"true");
        return this;
    }
    public Room roomsNavigation(){
        ElementActions.click(driver,Rooms);
        return new Room(driver);
    }
    public Info InfoNavigation(){
        ElementActions.click(driver,Info);
        return new Info(driver);
    }
    public Home
    choseCity(){
        ElementActions.click(driver,Town);
        return this;
    }
    public Home choseDate(){
        ElementActions.click(driver,DateVisit);
        return this;
    }
    public Home sendConfirmationEmail(){
        ElementActions.click(driver,SendEmail);
        return this;
    }

}
