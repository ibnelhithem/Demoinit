package web;

import com.shaft.gui.element.ElementActions;
import com.shaft.validation.Validations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends Base{
    private By pageTitle = By.id("firstHeading");
    private By advanced = By.linkText("Advanced");
    private By usr = By.id("mw-search-ns1");

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }
    public SearchResultsPage verifyPage(){
        ElementActions.isElementDisplayed(driver, pageTitle);
        Validations.assertThat().element(driver, pageTitle).exists();
        return this;
    }
    public SearchResultsPage advancedSearch(){
        ElementActions.click(driver, advanced);
        ElementActions.click(driver,usr);
        return this;
    }
}
