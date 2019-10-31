package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjectmodel.objectsforlogin;

import java.util.concurrent.TimeUnit;

public class implicitwaiteg {

    public void main(String[] args){
        System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
            driver.get("https://www.phptravels.net/login");

        PageFactory.initElements(driver, objectsforlogin.class);

        objectsforlogin.usernameval.sendKeys("user@phptravels.com");
        objectsforlogin.passwordval.sendKeys("demouser");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        objectsforlogin.submitbutton.click();


}}
