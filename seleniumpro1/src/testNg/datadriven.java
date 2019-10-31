package testNg;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;

public class datadriven {
    String [][] data=null;
    WebDriver driver;
    @DataProvider(name = "logindata")
    public String[][] sendingvalue() throws IOException, BiffException {
        data=getdatefromexcel();
        return data;
    }
    @Test
    public String[][] getdatefromexcel() throws IOException, BiffException {
        FileInputStream fileval=new FileInputStream("E:\\data_sheet.xls");
        Workbook workbook=Workbook.getWorkbook(fileval);
        Sheet sheet=workbook.getSheet(0);
        int rowcount=sheet.getRows();
        int columncount=sheet.getColumns();
        String testdata[][]=new String[rowcount-1][columncount];
        for (int i=1;i<rowcount;i++){
            for(int j=0;j<columncount;j++){
                testdata[i-1][j]=sheet.getCell(j,i).getContents();
            }
        }
        return testdata;

    }
    @BeforeTest
    public void loadbrowse(){
        System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
        driver=new ChromeDriver();

    }
    @AfterTest
    public void quitbrowser(){
        driver.quit();
    }
    @Test(dataProvider = "logindata")
    public void login(String uname,String passwors){
        driver.get("https:\\opensource-demo.orangehrmlive.com");
        WebElement username=driver.findElement(By.id("txtUsername"));
        username.sendKeys(uname);
        WebElement pass=driver.findElement(By.id("txtPassword"));
        pass.sendKeys(passwors);
        WebElement submitbutton=driver.findElement(By.name("Submit"));
        submitbutton.click();
    }
}
