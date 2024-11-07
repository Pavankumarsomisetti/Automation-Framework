 package demos;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
 import org.testng.annotations.AfterMethod;
 import org.testng.annotations.BeforeMethod;
 import org.testng.annotations.Test;
public class FirastClass {
	  WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
//	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	    @Test
	    public void testMethod1() {
	        driver.get("https://www.selenium.dev/downloads/");
	        // Perform actions on the webpage
	        System.out.println("FirstTestClass - testMethod1 executed");
	    }

	    @AfterMethod
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
}
