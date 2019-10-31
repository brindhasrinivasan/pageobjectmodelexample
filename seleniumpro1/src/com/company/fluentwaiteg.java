package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjectmodel.objectsforlogin;

import java.time.Duration;

public class fluentwaiteg {
    public void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.phptravels.net/login");

        PageFactory.initElements(driver, objectsforlogin.class);

        objectsforlogin.usernameval.sendKeys("user@phptravels.com");
        objectsforlogin.passwordval.sendKeys("demouser");
        Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
        .withTimeout(Duration.ofSeconds(30))
        .pollingEvery(Duration.ofSeconds(3))
        .ignoring(NoSuchElementException.class);
}
}



