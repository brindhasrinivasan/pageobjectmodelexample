package com.company;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjectmodel.objectsforlogin;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class explicitwaiteg {

    public void main(String[] args) throws IOException {
        System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.phptravels.net/login");

        PageFactory.initElements(driver, objectsforlogin.class);

        objectsforlogin.usernameval.sendKeys("user@phptravels.com");
        objectsforlogin.passwordval.sendKeys("demouser");
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement profile=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("\"//BUTTON[@type='submit'][text()='Login']\"")));

        profile.click();
        //objectsforlogin.submitbutton.click();


    }
}
