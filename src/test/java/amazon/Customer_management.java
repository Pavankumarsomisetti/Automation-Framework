package amazon;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class Customer_management extends Amazon_Test_scripts {
	@Test
	public void search() {
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("i phone 11 @");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
