package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Collections;
import java.util.List;

public class autocompleteeg {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http:\\www.leafground.com/pages/autoComplete.html");

        WebElement ent=driver.findElement(By.xpath("//INPUT[@id='tags']"));
        ent.sendKeys("s");
        Thread.sleep(4000);
        List<WebElement> options=driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
        int app=options.size();
        System.out.println(app);
        for (WebElement webdetail:options) {
            if (webdetail.getText().equals("Selenium")){
                webdetail.click();
                break;
            }

        }


    }
}
