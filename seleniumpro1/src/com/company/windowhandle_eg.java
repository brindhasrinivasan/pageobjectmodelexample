package com.company;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class windowhandle_eg {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http:\\www.leafground.com/pages/Window.html");

        String oldwin = driver.getWindowHandle();

        WebElement firstwin=driver.findElement(By.id("home"));
        firstwin.click();

        Set<String> handleswin=driver.getWindowHandles();
        for (String newhandles:handleswin) {
            driver.switchTo().window(newhandles);
        }

        WebElement newwin=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/h5"));
        newwin.click();
        driver.close();
        driver.switchTo().window(oldwin);

        WebElement secwin=driver.findElement(By.xpath("//BUTTON[@onclick='openWindows()'][text()='Open Multiple Windows']"));
        secwin.click();
        int countofwin=driver.getWindowHandles().size();
        System.out.println(countofwin);

        TakesScreenshot screenshots=(TakesScreenshot) driver;
        File sourcefile=screenshots.getScreenshotAs(OutputType.FILE);
        File destfile=new File("E:\\sample.png");
        FileHandler.copy(sourcefile,destfile);


        WebElement thirdbut=driver.findElement(By.id("color"));
        thirdbut.click();
        Set<String> allwindhan=driver.getWindowHandles();
        for (String manywin:allwindhan) {
            if(!manywin.equals(oldwin)){
                driver.switchTo().window(manywin);
                driver.close();
            }
        }
        driver.switchTo().window(oldwin);
        //WebElement lastbut=driver.findElement(By.id("//*[@id=\'color\')");
        //lastbut.

    }
}
