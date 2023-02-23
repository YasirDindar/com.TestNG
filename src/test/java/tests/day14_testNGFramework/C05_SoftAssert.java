package tests.day14_testNGFramework;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C05_SoftAssert {
    @Test (groups = {"minireg1","smoke"})
    public void test01(){
        //1- softAssert objesi olusturmak
        SoftAssert softAssert = new SoftAssert();

        //2- softAssert objesini kullanarak istenilen assertionlari yapin
        softAssert.assertEquals(6,6);
        System.out.println("1.assert sonrasi");
        softAssert.assertTrue(5>3);
        System.out.println("2.assert sonrasi");
        softAssert.assertFalse(3>5);
        System.out.println("3.assert sonrasi");

        //3- softAssert'e raporla diyecegiz
        softAssert.assertAll();//bu satirda calisma durur cunku failed olan assertion var
        System.out.println("assertAll sonrasi");
    }
    /*
    Genelde "test edin" dendiğinde hard assert , doğrulayın(verify) denirse soft assert kullanılır.
     */
}
