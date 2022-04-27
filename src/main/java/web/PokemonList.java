package web;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import com.shaft.validation.Validations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class PokemonList extends Base{
    private By yamask = By.linkText("Yamask");
    private By pokemonCount = By.linkText("^y.*$");

    public PokemonList(WebDriver driver) {
        super(driver);
    }
    public PokemonList verifyPage(){
        Assert.assertTrue(BrowserActions.getCurrentURL(driver).contains("List_of_Po"));
        return this;
    }
    public PokemonList verifyYamaskPokemon(){
        Validations.assertThat().element(driver, yamask).exists();
        return this;
    }
    public PokemonList getPokemonCount(){
        int numOfElements = ElementActions.getElementsCount(driver, pokemonCount);
        System.out.println("hassan "+numOfElements);
        return this;
    }
}
