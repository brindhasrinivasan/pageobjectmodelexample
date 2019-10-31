package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class sortableeg {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http:\\www.leafground.com/pages/sortable.html");

        List<WebElement> colist=driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
        Actions action=new Actions(driver);

        WebElement fromele=colist.get(6);
        WebElement toele=colist.get(0);
        action.clickAndHold(fromele);
        action.moveToElement(toele);
        action.release(toele);
        action.build().perform();
    }

}
