package mobile;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Info extends Base{

    private By Share = By.xpath("//*[contains(@content-desc,'Share this app')]\n");
    public Info(WebDriver driver) {
        super(driver);
    }
    public Info verifyPage(){
        Assert.assertEquals(ElementActions.getAttribute(driver,Share,"displayed"),"true");
        return this;
    }
}
