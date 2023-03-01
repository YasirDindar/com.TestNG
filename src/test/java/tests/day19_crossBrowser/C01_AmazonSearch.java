package tests.day19_crossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.CrossDriver;
import utilities.TestBaseCross;

public class C01_AmazonSearch extends TestBaseCross {

    @Test
    public void test01(){
        //amazon anasayfaya gidelim
        //Nutella icin arama yapalim
        //sonuclarin Nutella icerdigini test edelim

        driver.get(ConfigReader.getProperty("amazonUrl"));

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella", Keys.ENTER);

        WebElement sonucYaziElementi = driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));

        String actualSonucYazisi = sonucYaziElementi.getText();
        String expectedSonucYazisi = "Nutella";

        Assert.assertTrue(actualSonucYazisi.contains(expectedSonucYazisi));

    }
}
