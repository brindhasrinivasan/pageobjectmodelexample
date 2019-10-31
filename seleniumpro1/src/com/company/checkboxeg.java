package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkboxeg {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http:\\www.leafground.com/pages/checkbox.html");

        WebElement java=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[1]"));
        java.click();
        WebElement selenium=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/input"));
        Boolean sele=selenium.isSelected();
        System.out.println(sele);

        WebElement deselect1=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/input[1]"));
        WebElement deselect2=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/input[2]"));
        if (deselect1.isSelected()){
            deselect1.click();
        }
        if (deselect2.isSelected()){
            deselect2.click();
        }
        WebElement allselect1=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[1]"));
        WebElement allselect2=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[2]"));
        WebElement allselect3=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[3]"));
        WebElement allselect4=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[4]"));
        WebElement allselect5=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[5]"));
        WebElement allselect6=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[6]"));
        allselect1.click();
        allselect2.click();
        allselect3.click();
        allselect4.click();
        allselect5.click();
        allselect6.click();


    }
}
