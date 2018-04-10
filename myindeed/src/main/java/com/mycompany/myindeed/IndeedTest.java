/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myindeed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author shashi
 */
public class IndeedTest {
    
    public static void main (String args[]){
         System.setProperty("webdriver.gecko.driver", "C:\\Users\\shashi\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
  
           WebDriver driver;
           String baseUrl;
             driver = new FirefoxDriver();
             baseUrl = "https://www.indeed.com/";
             driver.get(baseUrl);
             driver.findElement(By.name("q")).sendKeys("java");
             driver.findElement(By.name("l")).click();
               driver.findElement(By.name("l")).clear();
                driver.findElement(By.name("l")).sendKeys("New York");
                driver.findElement(By.className("icl-WhatWhere-button")).click();
                System.out.println (driver.getTitle());
                driver.quit();
                
    
    }
    
}
