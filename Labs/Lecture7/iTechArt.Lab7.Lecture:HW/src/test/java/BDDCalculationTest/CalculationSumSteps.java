package BDDCalculationTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CalculationSumSteps {
    private Calculator object;
    @Given("I start calculator")
    public void iStartCalculator() {
        object = new Calculator();
    }
    @Given("I have the first number 5")
    public void i_have_the_first_number() {
        // Write code here that turns the phrase above into concrete actions
        object.setFirstNumber(2);
        throw new io.cucumber.java.PendingException();
    }
    @Given("I have the second number 2")
    public void i_have_the_second_number() {
        // Write code here that turns the phrase above into concrete actions
        object.setSecondNumber(3);
        throw new io.cucumber.java.PendingException();
    }

    @When("I want to sum this numbers")
    public void i_want_to_sum_this_numbers() {
        // Write code here that turns the phrase above into concrete actions
        int result = object.Sum();
        throw new io.cucumber.java.PendingException();
    }

    @Then("the result should be 7")
    public void the_result_should_be(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        int result = object.Sum();
        Assert.assertEquals(result, 5);
    }


    @And("I have subtractNumber {int}")
    public void iHaveSubtractNumber(int arg0) {
        object.setFirstNumber(10);
        throw new io.cucumber.java.PendingException();
    }

    @And("I have subtractNumberTwo {int}")
    public void iHaveSubtractNumberTwo(int arg0) {
        object.setSecondNumber(5);
    }

    @When("I want to subtract this numbers")
    public void iWantToSubtractThisNumbers() {
        int result = object.Subtract();
    }

    @Then("the result is {int}")
    public void theResultIs(int arg0) {
        int result = object.Sum();
        Assert.assertEquals(result, 2);
    }

    @And("I have divisinNumber {int}")
    public void iHaveDivisinNumber(int arg0) {
        object.setFirstNumber(arg0);
    }

    @And("I have divisinNumberTwo {int}")
    public void iHaveDivisinNumberTwo(int arg0) {
        object.setFirstNumber(arg0);
    }

    @When("I want to divide this numbers")
    public void iWantToDivideThisNumbers() {
        int result = object.Divide(object.getFirstNumber(), object.getSecondNumber() );
    }

    @Then("the result of division is {int}")
    public void theResultOfDivisionIs(int arg0) {
        arg0 = object.Divide(object.getFirstNumber(), object.getSecondNumber());
        Assert.assertEquals(arg0, 2);
    }

    @And("I have multipleNumber {int}")
    public void iHaveMultipleNumber(int arg0) {
        object.setFirstNumber(arg0);
    }

    @And("I have multipleNumberTwo {int}")
    public void iHaveMultipleNumberTwo(int arg0) {
        object.setSecondNumber(arg0);
    }

    @When("I want to multiple this numbers")
    public void iWantToMultipleThisNumbers() {
        int result = object.Multiple(object.getFirstNumber(), object.getSecondNumber());
    }

    @Then("the result of multiple is {int}")
    public void theResultOfMultipleIs(int arg0) {
        Assert.assertEquals(object.Multiple(object.getFirstNumber(), object.getSecondNumber()), 50);
    }
}
