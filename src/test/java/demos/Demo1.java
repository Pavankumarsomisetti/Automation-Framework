package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {

	public WebDriver driver;
	@BeforeTest
	public void launchingbrowser() {
		
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test
	public void login() throws Exception {
		
		driver.findElement(By.className("Pke_EE")).sendKeys("i phone",Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='XqNaEv'])[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='8 GB and Above']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='fxf7w6 rgHxCQ'])[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='XqNaEv'])[16]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='fxf7w6 rgHxCQ'])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='5000 - 5999 mAh']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='fxf7w6 rgHxCQ'])[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='6.4 inch & Above']")).click();
	}
	
}
