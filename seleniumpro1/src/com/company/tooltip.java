package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class tooltip {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        FirefoxOptions fire=new FirefoxOptions();
        fire.addArguments("--start-maximized");//
        driver.get("http:\\www.leafground.com/pages/tooltip.html");

        WebElement tool=driver.findElement(By.id("age"));
        String val=tool.getAttribute("title");
        System.out.println(val);

        driver.manage().window().maximize();//
        Dimension dim=new Dimension(800,500);
        driver.manage().window().setSize(dim);//


    }

    }
