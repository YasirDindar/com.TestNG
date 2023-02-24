package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualitydemyPage {
    public QualitydemyPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[text()='Log in']")
    public WebElement ilkLoginElementi;

    @FindBy (xpath = "//input[@type='email']")
    public WebElement kullaniciEmailKutusu;

    @FindBy (xpath = "//input[@type='password']")
    public WebElement passwordKutusu;

    @FindBy (xpath = "//button[text()='Login']")
    public WebElement loginButonu;

    @FindBy (xpath = "//a[text()='Accept']")
    public WebElement cookie;

    @FindBy (linkText = "My courses")
    public WebElement basariliGrisiLinki;

    @FindBy (xpath = "//a[text()='Instructor']")
    public WebElement instructorElementi;

    @FindBy (xpath = "//span[@class='account-position']")
    public WebElement testUserInstructorElementi;

    @FindBy (xpath = "(//div[@class='card-body text-center'])[1]")
    public WebElement numberOfCoursesElementi;

    @FindBy (xpath = "(//div[@class='col-6'])[1]")
    public WebElement aktiveCoursesElementi;

    @FindBy (xpath = "(//div[@class='col-6'])[2]")
    public WebElement pendingCoursesElementi;
}
