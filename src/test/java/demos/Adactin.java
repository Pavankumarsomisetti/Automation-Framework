package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Adactin {
	@Test
	public void operations() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		driver.findElement(By.id("username")).sendKeys("harish1100",Keys.TAB,"Harish@99",Keys.ENTER);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(Keys.CONTROL+ "a");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("02/02/2000");
        driver.findElement(By.id("datepick_out")).sendKeys(Keys.CONTROL+ "a");
        driver.findElement(By.id("datepick_out")).sendKeys("24/02/2000");
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("document.getElementsByClassName('date_pick')[0].value='02/02/2000'");
	}

}
