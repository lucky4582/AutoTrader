/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mybookproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author shashi
 */
public class Book {
    
    String title;
    String author;
    int isbn;
    public Object getAuthor;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
        
         //Among the facilities provided by the System class are standard input, standard output, and error output streams; access to externally defined "properties"; a means of loading files and libraries; and a utility method for quickly copying a portion of an array.
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\shashi\\Downloads\\geckodriver-v0.19.1-win64.zip\\geckodriver.exe");

    // Create a new instance of the html unit driver
// Notice that the remainder of the code relies on the interface,
// not the implementation.
        WebDriver driver = new FirefoxDriver();
// And now use this to visit Google
        driver.get("http://www.google.com");
// Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));
// Enter something to search for
        element.sendKeys("Hello Selenium WebDriver!");
// Submit the form based on an element in the form
        element.submit();
// Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
 
        
        
    }
    
    
    
}
