package org.example.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.IsItFriday;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsItFridayStepDefinitions {

    private String today;
    private String actualAnswer;

    @Given("today is Sunday")
    public void givenTodayIsFriday() {
        today = "Sunday";
    }

    @When("I ask whether it's Friday yet")
    public void whenIAskIfItIsFriday() {
        IsItFriday isItFriday = new IsItFriday();
        actualAnswer = isItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void thenIShouldBeTold(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}
