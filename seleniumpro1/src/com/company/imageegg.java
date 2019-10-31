package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class imageegg {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http:\\www.leafground.com\\pages\\Image.html");

        WebElement imgclick=driver.findElement(By.xpath("//IMG[@src='../images/home.png']"));
        imgclick.click();
        WebElement returnto=driver.findElement(By.xpath("(//A[@class='wp-categories-link maxheight'])[4]"));
        returnto.click();

        WebElement broko=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
        if (broko.getAttribute("naturalWidth").equals("0")){
            System.out.println("image is broken");
        }else {
            System.out.println("image is good");
        }

        WebElement third=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/img"));

        Actions action=new Actions(driver);
        action.click(third).build().perform();
    }

}
