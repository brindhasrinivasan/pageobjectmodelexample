package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjectmodel.objectsforlogin;
import pageObjectmodel.updatingprofileobjects;

public class pomeg {
    @Test
    public void loginfortravel() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.phptravels.net/login");

        PageFactory.initElements(driver,objectsforlogin.class);

        objectsforlogin.usernameval.sendKeys("user@phptravels.com");
        objectsforlogin.passwordval.sendKeys("demouser");
        Thread.sleep(5000);
        objectsforlogin.submitbutton.click();
        Thread.sleep(5000);
        /*objectsforlogin.usernameval(driver).sendKeys("user@phptravels.com");
        objectsforlogin.passwordval(driver).sendKeys("demouser");
        objectsforlogin.submitbutton(driver).click();*/
        /*updatingprofileobjects.myprofile(driver).click();
        updatingprofileobjects.phonenumber(driver).sendKeys("123457");
        updatingprofileobjects.city(driver).sendKeys("chennai");
        updatingprofileobjects.submit(driver).click();*/

        PageFactory.initElements(driver, updatingprofileobjects.class);
        updatingprofileobjects.myprofile.click();
        Thread.sleep(3000);
        updatingprofileobjects.phonenumber.sendKeys("123457");
        updatingprofileobjects.city.sendKeys("chennai");
        Thread.sleep(3000);
        updatingprofileobjects.submit.click();

        //driver.quit();


    }
}
