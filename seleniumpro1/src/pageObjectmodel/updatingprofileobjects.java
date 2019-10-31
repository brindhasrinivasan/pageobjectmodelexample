package pageObjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class updatingprofileobjects {

    @FindBy(xpath = "//A[@href='#profile']")
    public static WebElement myprofile;
    @FindBy(name = "phone")
    public static WebElement phonenumber;
    @FindBy(name = "city")
    public static WebElement city;
    @FindBy(xpath = "//BUTTON[@class='btn btn-action btn-block updateprofile'][text()=' Submit ']")
    public static WebElement submit;


    /*public static WebElement myprofile(WebDriver driver){
        return driver.findElement(By.xpath("//A[@href='#profile']"));
    }
    public static WebElement phonenumber(WebDriver driver){
        return driver.findElement(By.name("phone"));
    }
    public static WebElement city(WebDriver driver){
        return driver.findElement(By.name("city"));
    }
    public static WebElement submit(WebDriver driver){
        return driver.findElement(By.xpath("//BUTTON[@class='btn btn-action btn-block updateprofile'][text()=' Submit ']"));
    }*/
}
