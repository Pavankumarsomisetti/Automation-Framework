package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;	

public class Irctc {
	
	public WebDriver driver;

	@Test
	public void login() throws Exception {
	    driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='search_btn loginText ng-star-inserted']")).click();
		driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("pavankumar3A2",Keys.TAB,"Pavankumarsomi1");
		Thread.sleep(15000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[normalize-space(@role)='searchbox'])[1]")).sendKeys("SC",Keys.ARROW_DOWN,Keys.ENTER,Keys.TAB,Keys.TAB,"ee",Keys.ARROW_DOWN,Keys.ENTER);
		//driver.findElement(By.xpath("(//*[contains(@role,'searchbox')])[1]")).sendKeys("SC",Keys.ARROW_DOWN,Keys.ENTER,Keys.TAB,Keys.TAB,"ee",Keys.ARROW_DOWN,Keys.ENTER);
    	driver.findElement(By.xpath("//*[contains(@class,'ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted')]")).click();
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(3000);  
	 WebElement E=   driver.findElement(By.xpath("(//*[contains(@placeholder,'DD/MM/YYYY *')])[2]"));
	 E.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
	    E.sendKeys("08/10/2024");
		//Thread.sleep(3000);
//		Actions act = new Actions(driver);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.ENTER).perform();
//		//act.keyDown(Keys.CONTROL).sendKeys("t").build().perform();
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(3000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(3000);
//		r.keyPress(KeyEvent.VK_ENTER);
	}

}
