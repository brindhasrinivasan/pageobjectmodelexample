package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class iframeeg {
    public static void main(String[] args) throws AWTException, IOException {
        System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http:\\www.leafground.com/pages/frame.html");
        driver.switchTo().frame(0);
        WebElement frame1=driver.findElement(By.id("click"));
        frame1.click();

        String contant=driver.findElement(By.id("click")).getText();
        driver.switchTo().defaultContent();
        System.out.println(contant);

        driver.switchTo().frame(1);
        driver.switchTo().frame("frame2");
        WebElement fame2=driver.findElement(By.id("click1"));
        fame2.click();
        driver.switchTo().defaultContent();

        List<WebElement> total= driver.findElements(By.tagName("iframe"));
        int findsize=total.size();
        System.out.println(findsize);

        Robot robot=new Robot();
        Dimension size=Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rect=new Rectangle(size);
        BufferedImage source=robot.createScreenCapture(rect);

        File destfile=new File("E:\\samp1.png");
        ImageIO.write(source,"png",destfile);




    }
}
