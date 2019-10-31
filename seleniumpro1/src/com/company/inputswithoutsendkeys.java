package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class inputswithoutsendkeys {
    public static void main(String[] args) throws AWTException {
        System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.co.in");
        WebElement search=driver.findElement(By.name("q"));

        JavascriptExecutor executor= (JavascriptExecutor) driver;
       // executor.executeScript("document.getElementsByName('q')[0].value='duck'","");
        //executor.executeScript("arguments[0].value='happy'",search);

        driver.switchTo().activeElement();
        Robot robo=new Robot();
        robo.keyPress(KeyEvent.VK_C);
        robo.keyRelease(KeyEvent.VK_C);
        robo.keyPress(KeyEvent.VK_A);
        robo.keyRelease(KeyEvent.VK_A);
        robo.keyPress(KeyEvent.VK_T);
        robo.keyRelease(KeyEvent.VK_T);


    }
}
