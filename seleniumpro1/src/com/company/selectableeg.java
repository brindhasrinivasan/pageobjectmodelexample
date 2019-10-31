package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class selectableeg {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http:\\www.leafground.com/pages/selectable.html");

        List<WebElement> val=driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
        int no=val.size();
        System.out.println(no);

        Actions actions=new Actions(driver);
        //actions.keyDown(Keys.CONTROL).click(val.get(0)).click(val.get(1)).click(val.get(2)).build().perform();

        actions.clickAndHold(val.get(0));
        actions.clickAndHold(val.get(1));
        actions.clickAndHold(val.get(2));
        actions.build().perform();




    }
}
