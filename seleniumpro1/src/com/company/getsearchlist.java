package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class getsearchlist {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.google.co.in");
        WebElement searchval=driver.findElement(By.name("q"));
        searchval.sendKeys("happy");
        Thread.sleep(3000);
        List<WebElement> listofval=driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
        //int position=0;
            for (WebElement webval:listofval) {
                String typeaval=webval.getText();
                System.out.println(typeaval);
                //position++;
                if(typeaval.contains("wishes")){
                    webval.click();break;
               /* if(position==3){
                    webval.click();break;*/
                }
             Thread.sleep(3000);
            /*List<WebElement> alllink=driver.findElements(By.tagName("a"));

            for (WebElement webvalue:alllink) {
                String allurls=webvalue.getAttribute("href");
                System.out.println(allurls);

            }
            Thread.sleep(3000);*/
            List<WebElement> greenlink=driver.findElements(By.xpath("//*[@id='search']//following::h3//following::div/cite"));
                for (WebElement webvalue1:greenlink) {
                    System.out.println(webvalue1.getText());

                }


        }

    }
}
