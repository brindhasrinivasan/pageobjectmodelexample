package com.company;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertexample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http:\\www.leafground.com\\pages\\Alert.html");

        WebElement alertbox=driver.findElement(By.xpath("//BUTTON[@onclick='normalAlert()'][text()='Alert Box']"));
        alertbox.click();
        Alert alertpag=driver.switchTo().alert();
        Thread.sleep(5000);
        alertpag.accept();


        WebElement confirmbox=driver.findElement(By.xpath("//BUTTON[@onclick='confirmAlert()'][text()='Confirm Box']"));
        confirmbox.click();
        Alert confirmpag=driver.switchTo().alert();
        Thread.sleep(5000);
        confirmpag.dismiss();


        WebElement promptbox=driver.findElement(By.xpath("//BUTTON[@onclick='confirmPrompt()'][text()='Prompt Box']"));
        promptbox.click();
        Alert confirmpage=driver.switchTo().alert();
        confirmpage.sendKeys("hello people");
        Thread.sleep(5000);
        confirmpag.accept();


        WebElement line_break=driver.findElement(By.xpath("//BUTTON[@onclick='lineBreaks()'][text()='Line Breaks?']"));
        line_break.click();
        Alert linepag=driver.switchTo().alert();
        String lineofpg = linepag.getText();
        System.out.println(lineofpg);
        Thread.sleep(5000);
        String expectedval="Hello\nHow are you  today?";
        if (lineofpg != expectedval){
            linepag.accept();
            System.out.println("success");
        }
         else{
            driver.quit();
            System.out.println("fail");
        }


    }
}
