/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
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
public class SellCar {
    
     private WebDriver driver;
   private String baseUrl;
    
    public SellCar() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void fillform() {
         FirefoxProfile profile = new FirefoxProfile(new File("C:\\Users\\shashi\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\z4lakrot.tester"));
FirefoxOptions opt = new FirefoxOptions();
opt.setProfile(profile);
driver = new FirefoxDriver(opt);
driver.get(baseUrl);

         driver.findElement(By.name("j_id_3q-carDetailsForm-j_id_bg-carDetailsFormColumn-vehicleDetail-vehicleDetailsColumn-vehicleZip")).clear();
         driver.findElement(By.name("j_id_3q-carDetailsForm-j_id_bg-carDetailsFormColumn-vehicleDetail-vehicleDetailsColumn-vehicleZip")).sendKeys("60107");
          //driver.findElement(By.name("j_id_3q-carDetailsForm-j_id_bg-carDetailsFormColumn-vehicleDetail-vehicleDetailsColumn-vehicleYear")).click();
         driver.findElement(By.name("j_id_3q-carDetailsForm-j_id_bg-carDetailsFormColumn-vehicleDetail-vehicleDetailsColumn-vehicleYear")).sendKeys("2011");
          new Select(driver.findElement(By.id("j_id_3q-carDetailsForm-j_id_bg-carDetailsFormColumn-vehicleDetail-vehicleDetailsColumn-vehicleMake"))).selectByVisibleText("BMW");
         // driver.findElement(By.className("atcui-selectOneMenu atcui-small atcui-selectOneMenu-styled")).sendKeys("Acura");
           //WebDriverWait wait = new WebDriverWait(driver, 5); 
           //driver.findElement(By.name("j_id_3q-carDetailsForm-j_id_bg-carDetailsFormColumn-vehicleDetail-vehicleDetailsColumn-vehicleMake")).sendKeys("Audi");
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
         System.setProperty("webdriver.gecko.driver", "C:\\Users\\shashi\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
         baseUrl ="https://www.autotrader.com/sell-my-car/ad/vehicle-details.xhtml?zip=60173&packageId=115908&offeringCode=SYC";
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
