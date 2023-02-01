package BDD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("user is on login page")
    public void user_is_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am on login page");
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters password and password")
    public void user_enters_user1_and_passwpord() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Entering data for user and password");
        throw new io.cucumber.java.PendingException();
    }
    @When("clicks on login button")
    public void clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Clicking on button login");
        throw new io.cucumber.java.PendingException();
    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Navigating to homepage");
        throw new io.cucumber.java.PendingException();
    }

}
