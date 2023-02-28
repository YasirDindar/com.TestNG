package tests.day18_htmlReports;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_HTML_Reports extends TestBaseRapor {
    @Test
    public void test01(){
        extentTest = extentReports.createTest("nutella testi","kullanici amazonda arayabilmeli");
        //amazon anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("Amazon anasayfaya gidildi");
        //nutella aratin
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella", Keys.ENTER);
        extentTest.info("arama kutusuna nutella yazip arama yapildi");
        //sonuclarin Nutella icerdigini test edelim
        String actualSonucYazisi = amazonPage.aramaSonucuElementi.getText();
        String expectedSonucYazisi = "Nutella";
        extentTest.info("arama sonuclari kaydedildi");
        Assert.assertTrue(actualSonucYazisi.contains(expectedSonucYazisi));
        extentTest.pass("arama sonuclarinin nutella icerdigi test edildi");
    }
}
