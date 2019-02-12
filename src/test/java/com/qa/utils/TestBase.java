package com.qa.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;

    public void TestBase(){
            try {
             prop = new Properties();
                FileInputStream fis= new FileInputStream("/Users/nomanhamayun/IdeaProjects/DemoGITRepo/src/test/java/com/qa/config/config.properties");
                prop.load(fis);
            }catch (IOException e){
                e.getMessage();
            }
    }

    public static void initialization (){
        String browserName =  prop.getProperty("browser");
        if (browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","/Users/nomanhamayun/IdeaProjects/DemoGITRepo/src/test/resources/chromedriver");
            driver=new ChromeDriver();
        }else if (browserName.equals("FF")){
            System.setProperty("webdriver.gecko.driver","/Users/nomanhamayun/IdeaProjects/DemoGITRepo/src/test/resources/chromedriver");
            driver=new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));
    }
}