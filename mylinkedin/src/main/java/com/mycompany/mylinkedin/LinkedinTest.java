/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mylinkedin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author shashi
 */
public class LinkedinTest {
    
     public static void main (String args[]){
           System.setProperty("webdriver.gecko.driver", "C:\\Users\\shashi\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
           
             WebDriver driver;
             String baseUrl;
             driver = new FirefoxDriver();
             baseUrl = "https://www.linkedin.com/";
             driver.get (baseUrl);
             driver.findElement(By.name("firstName")).sendKeys("Tejash");
             driver.findElement(By.name("lastName")).sendKeys("Patel");
             driver.findElement(By.name("session_key")).sendKeys("tpatel0716@yahoo.com");
             driver.findElement(By.name("session_password")).sendKeys("indai1234");
              System.out.println (driver.getTitle());
             
             
           
           
       
         
     }
    
 
    
}
