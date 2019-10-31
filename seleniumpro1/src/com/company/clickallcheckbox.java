package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.util.List;

public class clickallcheckbox {
    public static void main(String[] args) throws AWTException {
        System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.leafground.com/pages/checkbox.html");

        List<WebElement> checkbox=driver.findElements(By.xpath("//*[@type='checkbox']"));
        for (WebElement allbox:checkbox) {
            allbox.click();
        }
    }
}
