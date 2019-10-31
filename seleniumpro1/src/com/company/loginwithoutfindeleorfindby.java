package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class loginwithoutfindeleorfindby {

    public static WebElement txtUsername;
    public static WebElement txtPassword;
    public static WebElement btnLogin;
    @Test
    public void loginall(){
        System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");
        PageFactory.initElements(driver,loginwithoutfindeleorfindby.class);
        txtUsername.sendKeys("Admin");
        txtPassword.sendKeys("admin123");
        btnLogin.click();
    }
}
