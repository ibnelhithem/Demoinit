package webtest;

import com.shaft.gui.browser.BrowserActions;
import org.testng.annotations.Test;
import web.HomeWeb;
import web.PokemonList;

public class PokimonVarification extends TestBaseWeb{
    PokemonList pokemonList;

    @Test
    public void verifyPage(){
        pokemonList = new PokemonList(super.driver);
        BrowserActions.navigateToURL(super.driver,"https://bulbapedia.bulbagarden.net/wiki/List_of_Pok%C3%A9mon_by_name#Y");
        pokemonList.verifyPage().verifyYamaskPokemon();
    }
}
