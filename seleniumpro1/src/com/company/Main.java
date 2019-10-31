package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http:\\www.leafground.com/pages/Edit.html");
       // driver.findElement(By.xpath("(//IMG[@class='wp-categories-icon svg-image'])[1]")).click();
        WebElement emailbox=driver.findElement(By.id("email"));
        emailbox.sendKeys("adsd@doo.com");
        WebElement appendtext=driver.findElement(By.xpath("(//INPUT[@type='text'])[2]"));
        appendtext.sendKeys("hello");
        WebElement valueoftab=driver.findElement(By.xpath("(//INPUT[@type='text'])[3]"));
        String value1=valueoftab.getAttribute("value");
        System.out.println(value1);
        WebElement cleartab=driver.findElement(By.xpath("(//INPUT[@type='text'])[4]"));
        cleartab.clear();
        WebElement empty=driver.findElement(By.xpath("(//INPUT[@type='text'])[5]"));
        boolean value2=empty.isEnabled();
        System.out.println(value2);

    }
}
