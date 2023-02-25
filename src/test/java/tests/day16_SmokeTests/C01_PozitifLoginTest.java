package tests.day16_SmokeTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_PozitifLoginTest {

    @Test
    public void pozitifLoginTest(){
        //qualitydemy anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.ilkLoginElementi.click();
        qualitydemyPage.cookie.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        qualitydemyPage.loginButonu.click();
        ReusableMethods.bekle(5);
        Assert.assertTrue(qualitydemyPage.basariliGrisiLinki.isDisplayed());
        Driver.closeDriver();
    }
}
