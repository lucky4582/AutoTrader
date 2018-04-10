/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import com.mycompany.mytestng.Calc;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author shashi
 */
public class CalcTest {
    
    Calc calc;
    private WebDriver driver;
    private String baseUrl;
    
    public CalcTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testadd() {
         assertEquals(calc.add(2,2),  4);
     
     }
     
      @Test
     public void testmul() {
         assertEquals(calc.mul(3,2),  6);
     
     }
     
     

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
        
     
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        
         System.setProperty("webdriver.gecko.driver", "C:\\Users\\shashi\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
         baseUrl ="https://www.kumon.com/attend-parent-orientation/";
                
        
        calc = new Calc();
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    
        @Test
    public void fillForm() {
                  
        System.out.println("launching firefox browser"); 
        driver = new FirefoxDriver(); 
                if (driver == null) fail (" driver is not initialize");
        driver.get(baseUrl);
                 
               WebDriverWait wait = new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.titleContains("Parent"));
driver.findElement(By.id("firstname")).sendKeys("Tejash");
driver.findElement(By.id("lastname")).sendKeys("Patel");
driver.findElement(By.id("email")).sendKeys("1234@123.com");
driver.findElement(By.id("homeaddress")).sendKeys("112 Azalea Circle");
driver.findElement(By.id("city")).sendKeys("Streamwood");

driver.findElement(By.id("zipcode")).sendKeys("60107");
driver.findElement(By.id("phonenumber")).sendKeys("123-456-7980");


driver.findElement(By.id("chklistitem71")).click();
driver.findElement(By.id("chklistitem3")).click();



        


 driver.findElement(By.id("sel1_chosen")).click();
driver.findElement(By.id("sel1_chosen")).sendKeys("United States");
 

//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
 
//driver.findElement(By.id("sel2_chosen")).click();
//driver.findElement(By.id("sel2_chosen")).sendKeys("Illinois");
Select State = new Select(driver.findElement(By.id("sel2_chosen")));
State.selectByVisibleText("Illinois");



//Select state = new Select(driver.findElement(By.id("state")));
//state.selectByVisibleText("Illinois");


















           



                 





 WebElement body = driver.findElement(By.tagName("body"));
 String bodyText = body.getText();
 assertTrue( bodyText.contains("This is a required field."));
    }
         
    
}
