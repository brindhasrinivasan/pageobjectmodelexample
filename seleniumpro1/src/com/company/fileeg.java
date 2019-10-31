package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class fileeg {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http:\\www.leafground.com/pages/download.html");

        WebElement file1=driver.findElement(By.linkText("Download Excel"));
        file1.click();
        Thread.sleep(4000);

        File filelocations=new File("C:\\Users\\BRINDHA\\Downloads");
        File[] allfile=filelocations.listFiles();

        for (File file:allfile) {
            if (file.getName().equals("testleaf.xlsx")) {
                System.out.println("excel downloaded");
            }

       // WebElement file2=driver.findElement(By.linkText("Download PDF"));
        //file2.click();
        //WebElement file3=driver.findElement(By.linkText("Download Text"));
        //file3.click();


        }
    }
}
