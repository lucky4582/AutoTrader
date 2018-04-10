/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import com.mycompany.mybookproj.Book;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author shashi
 */
public class BookTest {
    
    Book book;
    
    
    public BookTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        book = new Book();
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void testAuthor() {
     book.setAuthor("tejash");
        assertEquals("tejash", book.getAuthor());
     
     }
     
     @Test
     public void testTitle() {
     book.setTitle("java");
        assertEquals("java", book.getTitle());
     
     }
     
    /**
     *
     */
    @Test
    public void hello() {
    
        
         //Among the facilities provided by the System class are standard input, standard output, and error output streams; access to externally defined "properties"; a means of loading files and libraries; and a utility method for quickly copying a portion of an array.
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\shashi\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");

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
