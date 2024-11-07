package demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class SecondClass {
	 WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
//	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new EdgeDriver();
	        driver.manage().window().maximize();
	    }

	    @Test
	    public void testMethod2() {
	        driver.get("https://mvnrepository.com/artifact/org.testng/testng");
	        // Perform actions on the webpage
	        System.out.println("SecondTestClass - testMethod2 executed");
	    }

	    @AfterMethod
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
}
