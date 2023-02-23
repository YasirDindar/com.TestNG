package tests.day14_testNGFramework;

import org.testng.annotations.Test;

public class C01_testNGIlkTest {
    /*
    TestNG test methodlarini isim sirasina gore calistirir
    priority degeri verilen methodlar priority degeri kucukten buyuge dogru calisir
    esit olan priority de harf sirasina bakilir
    eger priority degeri yazmazsak priority =0 kabul edilir
     */
    @Test (priority = 6)
    public void ilkTest(){

    }
    @Test (priority = 9)
    public void ikinciTest(){

    }
    @Test (priority = 44)
    public void ucuncuTest(){

    }
}
