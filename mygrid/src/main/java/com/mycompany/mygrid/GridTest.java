/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mygrid;

import static com.google.gson.internal.bind.TypeAdapters.URL;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 *
 * @author shashi
 */
public class GridTest {
    
    	public static WebDriver driver;
 
	public static void main(String[]  args) throws MalformedURLException, InterruptedException{
 
 		String URL = "http://www.DemoQA.com";
 		String Node = "http://localhost:4444/wd/hub";
 		//DesiredCapabilities cap = DesiredCapabilities.firefox();
                DesiredCapabilities cap = DesiredCapabilities.chrome();
               
 
 		driver = new RemoteWebDriver(new URL(Node), cap);
 
 		driver.navigate().to(URL);
 		Thread.sleep(5000);
 		driver.quit();
 	}		
    
}
