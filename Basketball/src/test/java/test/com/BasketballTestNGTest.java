/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
public class BasketballTestNGTest {
    private WebDriver driver;
   private String baseUrl;
    
    
    public BasketballTestNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void basketball() {
      WebDriver driver;
           String baseUrl;
           driver = new ChromeDriver();
            baseUrl = "http://google.com";
            driver.get (baseUrl);
            
            driver.findElement(By.name("q")).sendKeys("Basketball");
               driver.findElement(By.name("q")).click();
            driver.findElement(By.name("btnK")).click();
            
             
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
        String baseUrl = "https://google.com//";
        
        //driver.findElement(By.name("q")).click();
       
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        
    }
}
