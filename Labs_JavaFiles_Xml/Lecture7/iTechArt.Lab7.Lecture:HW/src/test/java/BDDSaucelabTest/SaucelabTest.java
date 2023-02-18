package BDDSaucelabTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SaucelabTest {

    private SauceLab object;
    @Given("user is on main page")
    public void userIsOnMainPage() {
        object = new SauceLab();
        object.enterPage("https://www.saucedemo.com/");
    }

    @When("user enters <username> and <password>")
    public void userEntersUsernameAndPassword() {
        object.enterUsername();
        object.enterPassword();
    }

    @And("clicks on the login button")
    public void clicksOnTheLoginButton() {
        object.clickOnSubmit();
    }

    @Then("user is navigated to home page")
    public void userIsNavigatedToHomePage() {
        object.navigateToHome();
    }

    @When("I click on button Add to card")
    public void iClickOnButtonAddToCard() {
        object.clickOnAddCart();
    }

    @Then("box has itemOne")
    public void boxHasItemOne() {
        object.boxHasItem();
    }

    @And("I click on box")
    public void iClickOnBox() {
        object.clickOnBox();
    }

    @Then("cart page is opened")
    public void cartPageIsOpened() {
        object.cartPage();
    }

}
