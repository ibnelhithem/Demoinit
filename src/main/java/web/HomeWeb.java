package web;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomeWeb extends Base{

    private By search = By.xpath("//input[@class='bg-global-nav-search-input']");
    public HomeWeb(WebDriver driver) {
        super(driver);
    }
    public SearchResultsPage doSearch(){ //it must take search data from test but I will ignore this principle snd go with static data
        (new ElementActions(driver)).type(search, "communities").keyPress(search, Keys.ENTER);
        return  new SearchResultsPage(driver);
    }
}
