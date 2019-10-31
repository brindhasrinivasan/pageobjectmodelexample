package com.company;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class userpassloginauth {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

    }
}
