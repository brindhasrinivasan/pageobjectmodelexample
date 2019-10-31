package pageObjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class objectsforlogin {

    @FindBy(name = "username")
    public static WebElement usernameval;
    @FindBy(name = "password")
    public static WebElement passwordval;
    @FindBy(xpath ="//BUTTON[@type='submit'][text()='Login']" )
    public static WebElement submitbutton;


    /*public static WebElement usernameval(WebDriver driver){
       return driver.findElement(By.name("username") );
    }
    public static WebElement passwordval(WebDriver driver){
        return driver.findElement(By.name("password"));
    }
    public static WebElement submitbutton(WebDriver driver){
        return driver.findElement(By.xpath("//BUTTON[@type='submit'][text()='Login']"));
    }*/
}
