package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class paralleltesteg {
    @Test
    public void opengoogle(){
        System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https:\\www.google.co.in");
        driver.quit();
    }
    @Test
    public void openbing(){
        System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https:\\www.bing.com");
        driver.quit();
    }

}
