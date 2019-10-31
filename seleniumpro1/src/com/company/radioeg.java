package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radioeg {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http:\\www.leafground.com\\pages\\radio.html");

        WebElement radio1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[1]"));
        Boolean status1=radio1.isSelected();
        WebElement radio2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[2]"));
        Boolean status2=radio2.isSelected();
        System.out.println(status1);
        System.out.println(status2);

        WebElement radiobox1=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[1]"));
        radiobox1.click();
        //WebElement radiobox2=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div"));
        //WebElement radiobox3=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div"));


    }
}
