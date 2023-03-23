package StepDefinitions;

import PAges.LeftNavi;
import PAges.Parent;
import PAges._01_DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_CountrSteps extends Parent {

    LeftNavi ln = new LeftNavi();
    _01_DialogContent dc = new _01_DialogContent();

    @And("Navigate to country page")
    public void navigateToCountryPage() {
        clickFunction(ln.setup);
        clickFunction(ln.parameters);
        clickFunction(ln.countries);
    }

    @When("create a country")
    public void createACountry() {
        clickFunction(dc.addButton);
        sendKeysFunction(dc.inputName, "tttaaaa");
        sendKeysFunction(dc.inputCode, "12345");
        clickFunction(dc.saveButton);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {

    }
}
