package com.qa.tests.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FristFeatureSteps {

    @Given("^I intend to write a test$")
    public void iIntendToWriteATest()  {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        System.out.println("this is Given");
    }

    @When("^I write step definition file$")
    public void iWriteStepDefinitionFile()  {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        System.out.println("this is When");
    }

    @Then("^assertion will check the result$")
    public void assertionWillCheckTheResult(){
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        System.out.println("this is Then");
    }
}
