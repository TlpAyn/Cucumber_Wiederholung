package PAges;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNavi {
    public LeftNavi() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

@FindBy(xpath = "//span[@class='nav-link-title ng-tns-c105-7 ng-star-inserted']")
    public WebElement setup;

@FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

@FindBy(xpath = "//span[text()='Countries']")
    public WebElement countries;


}
