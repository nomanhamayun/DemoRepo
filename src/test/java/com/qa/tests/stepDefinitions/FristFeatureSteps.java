package com.qa.tests.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FristFeatureSteps {


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

    @Then("^user enters invalid username and password$")
    public void userEntersUsernameAndPassword() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("email")).sendKeys("nomanhamayun");
        driver.findElement(By.name("password")).sendKeys("password");
    }

    @And("^user clicks on login button$")
    public void userClicksOnLoginButton() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
    }

    @And("^user views error message$")
    public void userViewsErrorMessage() {
        // Write code here that turns the phrase above into concrete actions
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertEquals("Something went wrong...", driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]/div")).getText());

    }
}
