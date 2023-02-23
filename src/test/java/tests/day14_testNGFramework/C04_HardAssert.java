package tests.day14_testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C04_HardAssert {
    /*
    testNG'de iki tane assert class'i vardir
    1.si JUnit'deki Assert class'i ile ayni method'lara sahiptir
    ilk failed olan assert isleminde calismaiy durdurur ve hata mesaji verir

    2.assert class'inin adi SoftAssert oldugu icin
    ilkineHardAssert denmistir.

    2. asert class'i ise SoftAssert class'idir
    SoftAssert biz raporla deyinceye kadar
    assertionlari failed olsa bile calistirmaya devam eder.
    biz raporla dedigimizde calisan assertionlardan kacinin
    failed oldugunu soyler ve failed olan assertion varsa
    raporla dedigimiz satirda calismayi durdurur
     */
    @Test
    public void test01(){

        Assert.assertTrue(6>4);
        System.out.println("1.assertion sonrasi");
        Assert.assertTrue(6>14);
        System.out.println("2.assertion sonrasi");
        Assert.assertEquals(6,6);
        System.out.println("3.assertion sonrasi");
    }
}
