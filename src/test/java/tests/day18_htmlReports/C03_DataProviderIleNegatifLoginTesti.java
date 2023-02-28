package tests.day18_htmlReports;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C03_DataProviderIleNegatifLoginTesti {
    @DataProvider
    public static Object[][] kullaniciBilgileri() {
        Object[][]  kullaniciBilgileriArr =
                {{"A11","A12345"},{"B11","B12345"},{"C11","C12345"},{"D11","D12345"},{"E11","E12345"}};
        return kullaniciBilgileriArr;
    }
    //qualtydemy anasayfaya gidin
    //verilen yanlis kullanici adi ve password kombinasyonlari icin
    //giris yapilamadigini test edin
    // username       password
    //A11              A12345
    //B12              B12345
    //C13              C12345
    //D14              D12345
    //E15              E12345


    @Test(dataProvider = "kullaniciBilgileri")
    public void negatifLoginTest(String username,String password){
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.ilkLoginElementi.click();
        if (qualitydemyPage.cookie.isDisplayed()){
            qualitydemyPage.cookie.click();
        }
        ReusableMethods.bekle(3);
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(username);
        qualitydemyPage.passwordKutusu.sendKeys(password);
        qualitydemyPage.loginButonu.click();
        Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());
    }
}
