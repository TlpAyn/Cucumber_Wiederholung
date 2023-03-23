package PAges;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _01_DialogContent {
    public _01_DialogContent() {

        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "span[class='mat-button-wrapper']")
    public WebElement anmeldung;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

@FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement inputName;

@FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    public WebElement inputCode;

@FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']/button")
    public WebElement saveButton;








}
