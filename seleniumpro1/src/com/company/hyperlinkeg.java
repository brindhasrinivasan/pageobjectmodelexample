package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class hyperlinkeg {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http:\\www.leafground.com\\pages\\Link.html");

        WebElement firstlink=driver.findElement(By.linkText("Go to Home Page"));
        firstlink.click();
        driver.navigate().back();

        WebElement second=driver.findElement(By.partialLinkText("Find where"));
        String ref=second.getAttribute("href");
        System.out.println(ref);

        WebElement third=driver.findElement(By.linkText("Verify am I broken?"));
        third.click();
        String tit=driver.getTitle();
        if(tit.contains("404")){
            System.out.println("link is broken");
        }
        driver.navigate().back();
        WebElement firstlink1=driver.findElement(By.linkText("Go to Home Page"));
        firstlink1.click();
        driver.navigate().back();
        List<WebElement> all=driver.findElements(By.tagName("a"));
        int val=all.size();
        System.out.println(val);




    }
}
