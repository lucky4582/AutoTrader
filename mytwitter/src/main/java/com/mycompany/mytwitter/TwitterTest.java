/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mytwitter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author shashi
 */
public class TwitterTest {
    
    public static void main (String args[]){
      System.setProperty("webdriver.gecko.driver", "C:\\Users\\shashi\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
      
      
        WebDriver driver;
        String baseUrl;
        driver = new FirefoxDriver();
        baseUrl = "https://twitter.com/";
        driver.get(baseUrl);
        driver.findElement(By.name("user[email]")).sendKeys("tpatel0716@yahoo.com");
        driver.findElement(By.name("user[user_password]")).sendKeys("India4582");
        System.out.println (driver.getTitle());
        
                }
    
}
