package mobiletest;

import mobile.Home;
import org.testng.annotations.Test;

public class Basictest extends TestBase{

    Home home;
    @Test
    public void navigationTest(){
        home = new Home(super.driver);
        home.registerNavigation().roomsNavigation().checexist().InfoNavigation().verifyPage();
    }

    @Test
    public void bookOffice(){
        home = new Home(super.driver);
        home.registerNavigation().choseDate().choseCity().sendConfirmationEmail();
    }
}
