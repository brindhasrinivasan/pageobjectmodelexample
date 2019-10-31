package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class listbox {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http:\\www.leafground.com\\pages\\Dropdown.html");

        WebElement list1=driver.findElement(By.id("dropdown1"));
        Select drop1=new Select(list1);
        drop1.selectByIndex(0);

        WebElement list2=driver.findElement(By.name("dropdown2"));
        Select drop2=new Select(list2);
        drop2.selectByVisibleText("Selenium");

        WebElement list3=driver.findElement(By.id("dropdown3"));
        Select drop3=new Select(list3);
        drop3.selectByValue("4");

        WebElement list4=driver.findElement(By.xpath("//SELECT[@class='dropdown']"));
        Select drop4=new Select(list4);
        List<WebElement> optionval =drop4.getOptions();
        int sizeoflis=optionval.size();
        System.out.println(sizeoflis);

        WebElement list5=driver.findElement(By.xpath("(//SELECT)[5]"));
        list5.sendKeys("selenium");

        WebElement list6=driver.findElement(By.xpath("//SELECT[@multiple='']"));
        Select multival=new Select(list6);
        multival.selectByValue("3");
        multival.selectByVisibleText("Selenium");
        multival.selectByIndex(4);


    }
}
