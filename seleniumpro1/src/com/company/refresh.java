package com.company;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

import static java.awt.event.KeyEvent.VK_F5;


public class refresh {
    public static void main(String[] args) throws AWTException {
        System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http:\\www.google.com");

        driver.get(driver.getCurrentUrl());
        driver.navigate().refresh();

        JavascriptExecutor executor1=(JavascriptExecutor) driver;
        executor1.executeScript("location.reload()");//history.go(0)

       /* Robot robot=new Robot();
        robot.keyPress(KeyEvent,VK_F5);
        robot.keyRelease(KeyEvent,VK_F5);*/

    }

}
