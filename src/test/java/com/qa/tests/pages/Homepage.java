package com.qa.tests.pages;

import com.qa.utils.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends TestBase {

    public void Homepage() {
        PageFactory.initElements(driver, this);
    }

    public String getPageTitle(){
        System.out.println ("Testing Jenkins integration with git");
        return driver.getTitle();

    }
}