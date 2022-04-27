package mobile;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Room extends Base{

    private By Plan = By.xpath("//*[contains(@content-desc,'Will be added')]\n");


    public Room(WebDriver driver) {
        super(driver);
    }

    public Home checexist(){
        Assert.assertEquals(ElementActions.getAttribute(driver,Plan,"displayed"),"true");
        //return this;
        return new Home(driver);
    }
}
