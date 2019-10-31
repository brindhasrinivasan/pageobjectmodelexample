package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class tableeg {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.navigate().to("http:\\www.leafground.com/pages/table.html");

        List<WebElement> columnno= driver.findElements(By.tagName("th"));
        int numcol=columnno.size();
        System.out.println(numcol);

        List<WebElement>  rowno=driver.findElements(By.tagName("tr"));
        int ronum=rowno.size();
        System.out.println(ronum);

        WebElement getval=driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
        String value=getval.getText();
        System.out.println(value);

        List<WebElement> check=driver.findElements(By.xpath("//td[2]"));
        List<Integer> sepvsl=new ArrayList<Integer>();
        for (WebElement webval:check) {
            String newvalue=webval.getText().replace("%","");
            sepvsl.add(Integer.parseInt(newvalue));

        }

        int smallval= Collections.min(sepvsl);
        //pathhy="//td[normailzed-space()='20%'//following::td[1]]"
        String pathval="//td[normalize-space()=" + "\""+  smallval +"%"+ "\""+"]//following::td[1]";
        WebElement nextcheck=driver.findElement(By.xpath(pathval));
        nextcheck.click();
    }
}
