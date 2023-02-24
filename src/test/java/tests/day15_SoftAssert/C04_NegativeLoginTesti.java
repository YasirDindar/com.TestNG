package tests.day15_SoftAssert;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C04_NegativeLoginTesti {
    //3 test methodu olusturun
    //1-yanlis email, dogru sifre
    //2-dogru email yanlis sifre
    //3-yanlis email yanlis sifre ile giris yapmayi deneyin
    //giris yapilamadigini test edin

    QualitydemyPage qualitydemyPage = new QualitydemyPage();
    @Test
    public void yanlisEmailTesti(){
        qualitydemyPage=new QualitydemyPage();
        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitydemyPage.ilkLoginElementi.click();
        qualitydemyPage.cookie.click();
        ReusableMethods.bekle(3);
        qualitydemyPage.kullaniciEmailKutusu.sendKeys("yasir@dindar.com");
        qualitydemyPage.passwordKutusu.sendKeys("31488081");
        qualitydemyPage.loginButonu.click();

        Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void yanlisPasswordTesti(){
        qualitydemyPage = new QualitydemyPage();
        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitydemyPage.ilkLoginElementi.click();
        qualitydemyPage.cookie.click();
        ReusableMethods.bekle(3);
        qualitydemyPage.kullaniciEmailKutusu.sendKeys("user_1106147@login.com");
        qualitydemyPage.passwordKutusu.sendKeys("123456");
        qualitydemyPage.loginButonu.click();

        Assert.assertTrue(qualitydemyPage.passwordKutusu.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void yanlisEmailveYanlisPasswordTesti(){
        qualitydemyPage = new QualitydemyPage();
        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitydemyPage.ilkLoginElementi.click();
        qualitydemyPage.cookie.click();
        ReusableMethods.bekle(3);
        qualitydemyPage.kullaniciEmailKutusu.sendKeys("yasir@dindar.com");
        qualitydemyPage.passwordKutusu.sendKeys("123456");
        qualitydemyPage.loginButonu.click();

        Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());
        Driver.closeDriver();
    }
}
