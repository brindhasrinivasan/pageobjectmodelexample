package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class javascriptexecutor {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.echoecho.com/htmlforms11.htm");

        JavascriptExecutor executor= (JavascriptExecutor) driver;
        /*executor.executeScript("window.scroll(0,450)","");
        Thread.sleep(3000);
        executor.executeScript("window.scroll(0,-450)","");*/

        /*executor.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
        Thread.sleep(3000);
        executor.executeScript("window.scrollTo(0,0)","");*/
/*
        WebElement linktex=driver.findElement(By.linkText("online tool"));
        executor.executeScript("arguments[0].scrollIntoView(true);",linktex);*/

        Robot rob=new Robot();
        rob.keyPress(KeyEvent.VK_PAGE_DOWN);
        rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
        Thread.sleep(3000);
        rob.keyPress(KeyEvent.VK_PAGE_UP);
        rob.keyRelease(KeyEvent.VK_PAGE_UP);


    }
}
