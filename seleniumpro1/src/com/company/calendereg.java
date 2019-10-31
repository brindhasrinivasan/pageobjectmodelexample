package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calendereg {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http:\\www.leafground.com/pages/Calendar.html");

        WebElement cala=driver.findElement(By.id("datepicker"));
        cala.click();
        WebElement nextaca=driver.findElement(By.xpath("//a[@title='Next']"));
        nextaca.click();
        WebElement findo=driver.findElement(By.xpath("//a[contains(text(),'10')]"));
        findo.click();
    }
}
