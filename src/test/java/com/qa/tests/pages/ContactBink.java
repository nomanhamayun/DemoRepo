package com.qa.tests.pages;

import com.qa.utils.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactBink extends TestBase {

    @FindBy(name="nf-field-8")
    WebElement fullName;

    @FindBy(name="email")
    WebElement emailAddress;

    @FindBy(name="nf-field-11")
    WebElement companyName;

    @FindBy(name="nf-field-14")
    WebElement companyPosition;

    @FindBy(name="nf-field-12")
    WebElement message;

    public void contactBink () {
        PageFactory.initElements(driver, this);
    }

    public void fillContactForm (){

        fullName.sendKeys("Business user");
        emailAddress.sendKeys("user@test.com");
        companyName.sendKeys("Test Co!");
        companyPosition.sendKeys("Test Director");
        message.sendKeys("Hi, I'm interested in Bink loyalty card link technology. Can I speak to you please.");
    }
}
