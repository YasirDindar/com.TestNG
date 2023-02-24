package tests.day15_SoftAssert;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.Driver;

public class C01_SoftAssert {
    @Test(groups = "minireg2")
    public void test01(){
        //amazon anasayfaya gidin
        Driver.getDriver().get("https://www.amazon.com");

        //amazon anasayfaya gittiginizi dogrulayin
        SoftAssert softAssert = new SoftAssert();
        String expectedUrlKelime="amazon";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedUrlKelime));

        //nutela aratin
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella", Keys.ENTER);

        //arama sonuclarinin nutella icerdigini dogrulayin
        String aramaSonucYazisi = amazonPage.aramaSonucuElementi.getText();
        softAssert.assertTrue(aramaSonucYazisi.contains("Nutella"));

        //java aratin
        amazonPage.amazonAramaKutusu.clear();
        amazonPage.amazonAramaKutusu.sendKeys("Java",Keys.ENTER);

        //arama sonuclarinin 1000'den fazla oldugunu dogrulayin
        aramaSonucYazisi =amazonPage.aramaSonucuElementi.getText();
        String []sonucArr = aramaSonucYazisi.split(" ");
        String javaSonucSayisiStr =sonucArr[3];
        javaSonucSayisiStr=javaSonucSayisiStr.replaceAll("\\W","");
        int sonucSayisiInt =Integer.parseInt(javaSonucSayisiStr);
        softAssert.assertTrue(sonucSayisiInt>1000);

        softAssert.assertAll();
        Driver.closeDriver();
    }
}
