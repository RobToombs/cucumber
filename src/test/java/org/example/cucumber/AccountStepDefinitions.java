package org.example.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Account;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountStepDefinitions {
    private Account account;

    @Given("account balance is {double}")
    public void givenAccountBalance(Double initialBalance) {
        account = new Account(initialBalance);
    }

    @When("the account is credited with {double}")
    public void whenAccountIsCredited(Double amount) {
        account.credit(amount);
    }

    @And("a payment of {double} is made")
    public void aPaymentOfIsMade(Double amount) {
        account.deduct(amount);
    }

    @Then("account should have a balance of {double}")
    public void thenAccountShouldHaveBalance(Double expectedBalance) {
        assertEquals(expectedBalance, account.getBalance());
    }

}
