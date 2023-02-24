package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ZeroWebAppPage {
    public ZeroWebAppPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//button[@id='signin_button']")
    public WebElement signInButonu;

    @FindBy (xpath = "//input[@type='text']")
    public WebElement userNameKutusu;

    @FindBy (xpath = "//input[@type='password']")
    public WebElement passwordKutusu;

    @FindBy (xpath = "//input[@type='submit']")
    public WebElement submitButonu;

    @FindBy (xpath = "//strong[text()='Online Banking']")
    public WebElement onlineBanking;

    @FindBy (xpath = "//span[text()='Pay Bills']")
    public WebElement payBillLinki;

    @FindBy (xpath = "//a[text()='Purchase Foreign Currency']")
    public WebElement purshaseForeignCurrencyTusu;

    @FindBy (xpath = "//select[@id='pc_currency']")
    public WebElement currencyDropdown;

}
