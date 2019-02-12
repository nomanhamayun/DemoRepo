package com.qa.tests.pages;

import com.qa.utils.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends TestBase {

    @FindBy(name = "nf-field-8")
    WebElement fullName;

    @FindBy(name = "email")
    WebElement emailAddress;

    @FindBy(name = "nf-field-11")
    WebElement companyName;

    @FindBy(name = "nf-field-14")
    WebElement companyPosition;

    @FindBy(name = "nf-field-12")
    WebElement message;

    public void Homepage() {
        PageFactory.initElements(driver, this);
    }
}