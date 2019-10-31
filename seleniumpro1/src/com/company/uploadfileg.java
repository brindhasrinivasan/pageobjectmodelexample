package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class uploadfileg {
    public static void main(String[] args) throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http:\\www.leafground.com/pages/upload.html");
        WebElement upy=driver.findElement(By.name("filename"));
        upy.click();

        //String file="C:\\Users\\BRINDHA\\Downloads\\testleaf.xsls";
        StringSelection selection=new StringSelection("C:\\Users\\BRINDHA\\Downloads\\testleaf.xsls");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
        Thread.sleep(3000);
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(3000);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);



    }
}
