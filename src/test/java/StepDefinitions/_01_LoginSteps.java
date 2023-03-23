package StepDefinitions;

import PAges.Parent;
import PAges._01_DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginSteps extends Parent {

    _01_DialogContent dc = new _01_DialogContent();
    @Given("Navigate to Campus")
    public void navigateToCampus() {

        GWD.getDriver().get("https://test.mersys.io/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {

        sendKeysFunction (dc.username,"turkeyts");
        sendKeysFunction(dc.password,"TechnoStudy123");
        clickFunction(dc.anmeldung);
    }


    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
    }
}
