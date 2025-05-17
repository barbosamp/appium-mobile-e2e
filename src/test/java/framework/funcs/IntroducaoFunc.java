package framework.funcs;


import base.framework.common.BaseTest;
import framework.pages.IntroducaoPage;
import org.openqa.selenium.By;



public class IntroducaoFunc extends BaseTest {

    IntroducaoPage introducaoPage = new IntroducaoPage();

    public void pularIntroducao(){
        driver.findElement(introducaoPage.getBotaoPular()).click();
    }
}
