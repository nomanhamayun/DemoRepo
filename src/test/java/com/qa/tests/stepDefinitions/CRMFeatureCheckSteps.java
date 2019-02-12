package com.qa.tests.stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRMFeatureCheckSteps {


    WebDriver driver;

    @Given("^User is already on Login Page$")
    public void userIsAlreadyOnLoginPage()  {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","/Users/nomanhamayun/IdeaProjects/DemoGITRepo/src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://ui.cogmento.com/");
    }

    @When("^title of page login page is Free CRM$")
    public void titleOfPageLoginPageIsFreeCRM() {
        // Write code here that turns the phrase above into concrete ßactions
        Assert.assertEquals("Login or Register", driver.findElement(By.className("content")).getText());
    }
    @Then("^user clicks on Classic CRM link$")
    public void userClicksOnClassicCRMLink() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.linkText("Classic CRM")).click();
    }

    @And("^user is directed to the Classic CRM page$")
    public void userIsDirectedToTheClassicCRMPage() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("https://classic.crmpro.com/login.cfm",driver.getCurrentUrl());
    }
}
