package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class browseropening {
    WebDriver driver;
    long starttime;
    long endtime;
    @BeforeSuite
    public void firstopen(){
        starttime=System.currentTimeMillis();
        System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
        driver=new FirefoxDriver();
    }
    @Test
    public void bingopen(){
       driver.get("https:\\www.bing.com");
    }
    @Test
    public void googleopen(){
        driver.get("https:\\www.google.com");
    }
    @Test
    public  void yahooopen(){
        driver.get("https:\\www.yahoo.com");
    }
    @AfterSuite
    public void endtask(){
        driver.quit();
        endtime=System.currentTimeMillis();
        long Totaltime=endtime-starttime;
        System.out.println(Totaltime);
    }
}
