package com.qa.tests.stepDefinitions;

import com.qa.tests.pages.Homepage;
import com.qa.utils.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomepageSteps extends TestBase {

    Homepage hp = new Homepage();

    @Given("^user opens browser$")
    public void userOpensBrowser() {
        // Write code here that turns the phrase above into concrete actions
        TestBase.initialization();

    }

    @When("^user accesses Bink's website$")
    public void userAccessesBinkSWebsite() {
        // Write code here that turns the phrase above into concrete actions
        TestBase.openURL();
    }


    @Then("^user lands on the homepage$")
    public void userLandsOnTheHomepage() {
        Assert.assertEquals("Retail Partners Bink", hp.getPageTitle());

    }

}
