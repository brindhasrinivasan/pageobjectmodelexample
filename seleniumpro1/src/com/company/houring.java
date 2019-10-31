package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class houring {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.google.co.in");

        WebElement val=driver.findElement(By.linkText("தமிழ்"));

        String before=val.getCssValue("text-decoration");
        System.out.println(before);

        Actions action=new Actions(driver);
        action.moveToElement(val);
        action.perform();

        String after=val.getCssValue("text-decoration");
        System.out.println(after);

    }
}
