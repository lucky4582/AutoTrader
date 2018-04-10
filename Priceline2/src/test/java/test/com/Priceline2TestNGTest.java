/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author shashi
 */
public class Priceline2TestNGTest {
    
    public Priceline2TestNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void priceline2() {
      WebDriver driver;
           String baseUrl;
           driver = new ChromeDriver();
            baseUrl = "http://priceline.com";
            driver.get (baseUrl);
            
            driver.findElement(By.xpath("//div[2]/div/input")).clear();
driver.findElement(By.xpath("//div[2]/div/input")).sendKeys("New York, NY");

driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[2]/div/section/div[1]/div[1]/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/div/div[1]/div/div/div/input")).sendKeys("04/18/2018");

driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[2]/div/section/div[1]/div[1]/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/input")).sendKeys("05/2/2018");
new Select(driver.findElement(By.xpath("//div/select"))).selectByVisibleText("4 Rooms");
driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[2]/div/section/div[1]/div[1]/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div/div/div[2]/div[2]/button")).click();
driver.findElement(By.id("LIST_RETAIL_CHOOSE_42721")).click();
    
//driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div[1]/div[4]/div[2]/div[2]/div[3]/div/div[3]/div/div/div[1]/div[10]/div[1]/div/div[1]/div[1]/div[3]/div[2]/div[2]/div/a/div/p")).click();
      
             
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        
         System.setProperty("webdriver.chrome.driver","C:\\Users\\shashi\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
        String baseUrl = "https://priceline.com//";
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
