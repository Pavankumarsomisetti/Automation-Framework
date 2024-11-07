package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Amazon_Test_scripts {
	
	public WebDriver driver;
	@BeforeClass
	public void launchingbrowser() {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

}
	
/*	@BeforeTest
	public void launchingbrowser2() {
		
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}*/
	
	@BeforeMethod
	public void login() throws Exception {
		
		driver.findElement(By.className("nav-line-1-container")).click();
		driver.findElement(By.id("ap_email")).sendKeys("8096837797",Keys.ENTER);
		
		driver.findElement(By.id("ap_password")).sendKeys("Dileep143@",Keys.ENTER);
		
		
	}
}
