package test.com;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.openqa.selenium.By.name;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 *
 * @author itexps
 */
@RunWith(value = Parameterized.class)
public class GridTestWithParam {

    private static String os;
    private static String browser;
    private static String version;
    public static RemoteWebDriver driver;
    public static String appURL = "http://www.google.com";

    // Inject via constructor
    public GridTestWithParam(String os, String browser, String version) {
        this.os = os;
        this.browser = browser;
        this.version = version;
    }

    @Test
    public void testGooglePageTitleInIEBrowser() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //browser
        if (browser.equalsIgnoreCase("firefox")) {
            capabilities = DesiredCapabilities.firefox();
        } else if (browser.equalsIgnoreCase("ie")) {
            capabilities = DesiredCapabilities.internetExplorer();
        }else if (browser.equalsIgnoreCase("chrom")) {
            capabilities = DesiredCapabilities.chrome();
        }

        //platform
        if (os.equalsIgnoreCase("windows")) {
            capabilities.setPlatform(org.openqa.selenium.Platform.WINDOWS);
        } else if (os.equalsIgnoreCase("mac")) {
            capabilities.setPlatform(org.openqa.selenium.Platform.MAC);
        }

        
         //Version
        //capabilities.setVersion(version);
 
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        driver.manage().window().maximize();
        System.out.println("*** Navigation to Application ***");
        driver.navigate().to(appURL);
        String strPageTitle = driver.getTitle();
        System.out.println("*** Verifying page title ***");
        assertEquals(strPageTitle, "Google");
        driver.quit();
    }

    // name attribute is optional, provide an unique name for test
    // multiple parameters, uses Collection<Object[]>
    @Parameterized.Parameters 
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            //{"WINDOWS", "ie", "11.0.36"},
            {"WINDOWS", "chrom", ""},
            {"WINDOWS", "firefox", "9.0.1"}});
    }

    
}

