package com.company;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.StandardSocketOptions;

public class buttonexample {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http:\\www.leafground.com\\pages\\Button.html");

        WebElement positionval=driver.findElement(By.id("position"));
        Point value=positionval.getLocation();
        Integer xvalue= value.getX();
        Integer yvalue=value.getY();
        System.out.println("the value of x:"+xvalue+"the value of y:"+yvalue);

        WebElement colourvalue=driver.findElement(By.id("color"));
        String colourofbg= colourvalue.getCssValue("background-color");
        System.out.println(colourofbg);

        WebElement sizevalue=driver.findElement(By.id("size"));
        Dimension dimemen=sizevalue.getSize();
        Integer width=dimemen.getHeight();
        Integer height=dimemen.getWidth();
        System.out.println(dimemen);
        System.out.println(width);
        System.out.println(height);


       // WebElement homebut=driver.findElement(By.xpath("//BUTTON[@id='home']"));
        //homebut.click();

    }
}
