package amazon;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends Amazon_Test_scripts {
	@Test
	public void click_on_product() {
		
     //driver.findElement(By.xpath("//img[@alt='Apple iPhone 15 (128 GB) - Black']")).click();
      // driver.findElement(By.xpath("(//div[contains(@class,'a-section a-spacing-none _fluid-fat-im')])[3]")).click();
		System.out.println("product is clicked ");
	}
	
	public void addtocart()
	{
		System.out.println("product is added to cart");
	}

}
