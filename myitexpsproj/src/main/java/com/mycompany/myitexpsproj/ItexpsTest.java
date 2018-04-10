/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myitexpsproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author shashi
 */
public class ItexpsTest {
    
     public static void main (String args[]){
         System.setProperty("webdriver.gecko.driver", "C:\\Users\\shashi\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
         
           WebDriver driver;
           String baseUrl;
           driver = new FirefoxDriver();
            baseUrl = "http://www.123formbuilder.com/sfnew2.php?s=1613473&option=3&forceframeon=1&styleid=25&instance=LVgUbwVszFu7w_CQGdLvaHSnqyxgBTxnrt-PbOs9GmA.eyJpbnN0YW5jZUlkIjoiMTQwOGM3NTctZTllMy0zZGZhLTMxMGEtZWI0OTQzZTA0ZDA4IiwiYXBwRGVmSWQiOiIxMmFhY2Y2OS1mM2ZiLTUzMzQtMjg0Ny1lMDBhOGYxM2MxMmYiLCJzaWduRGF0ZSI6IjIwMTgtMDMtMTdUMjM6NTc6MTQuMDcwWiIsInVpZCI6bnVsbCwiaXBBbmRQb3J0IjoiNzMuMjA5LjE3Ni4zMS8zNzAxMSIsInZlbmRvclByb2R1Y3RJZCI6IkdvbGRXaXgiLCJkZW1vTW9kZSI6ZmFsc2UsImFpZCI6IjhhZDIxYjY5LTdhYzgtNDlkZC1iMjBjLTMwZDQ2ZGIwNWRkZCIsInNpdGVPd25lcklkIjoiMTgxMTI3ODctNWJkNS00MDBiLTlhOGQtMjBkMDNmNDAyNTRiIn0&compId=if7qy771&viewMode=site&deviceType=desktop&locale=en&PHPSESSID=5hou4mtdeq94n3oo0s069g3og0&refEn=aHR0cDovL3d3dy5pdGV4cHMubmV0L2NvbnRhY3QtdXM=&_referrerEn_=";
            driver.get (baseUrl);
             
           
              driver.findElement(By.id("id123-control14665476")).click();
            driver.findElement(By.id("id123-control15822436")).click();
            driver.findElement(By.id("id123-control14665380")).click();
            driver.findElement(By.id("id123-control14665383-1")).click();
            driver.findElement(By.id("id123-control14665383-2")).click();
            driver.findElement(By.id("id123-control14665383-3")).click();
            driver.findElement(By.id("id123-control14665379")).click();
            driver.findElement(By.id("id123-control14665381")).click();
            driver.findElement(By.id("id123-button-send")).click();   
         
            
                    
         
           
           
        
    
}    

    
    }

