package webtest;

import org.testng.annotations.Test;
import web.HomeWeb;

public class SearchVerifications extends TestBaseWeb{
    HomeWeb homeWeb;

    @Test
    public void search(){
        homeWeb = new HomeWeb(super.driver);
        homeWeb.doSearch().verifyPage().advancedSearch();
    }
}
