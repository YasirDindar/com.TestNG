package tests.day15_SoftAssert;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C03_PozitifLoginTest {
    @Test (groups = "smoke")
    public void test01(){
        //1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get("https://www.qualitydemy.com/");

        //2- login linkine basin
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.ilkLoginElementi.click();

        qualitydemyPage.cookie.click();
        ReusableMethods.bekle(3);
        // 3- Kullanici email’i olarak valid email girin
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));

        // 4- Kullanici sifresi olarak valid sifre girin
        qualitydemyPage.passwordKutusu.sendKeys("qdGecerliPassword");

        // 5- Login butonuna basarak login olun
        qualitydemyPage.loginButonu.click();

        // 6- Basarili olarak giris yapilabildigini test edin
        Assert.assertTrue(qualitydemyPage.basariliGrisiLinki.isDisplayed());
        Driver.closeDriver();
    }
}
