package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
	//public static void main(String[] args) throws Exception {
	@Test
	public void operations() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.className("nav-line-1-container")).click();
		driver.findElement(By.id("ap_email")).sendKeys("8096837797",Keys.ENTER);
		driver.findElement(By.id("ap_password")).sendKeys("Dileep143@",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i phone15",Keys.ENTER);
		driver.findElement(By.id("a-autoid-1-announce")).click();
		Thread.sleep(1000);
		/*driver.findElement(By.id("nav-cart-count")).click();
		Thread.sleep(1000);
		driver.navigate().back();*/
		driver.findElement(By.xpath("//span[text()='Get It in 2 Days']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='OnePlus']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='128GB']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Eligiblefor Pay On Delivery']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='5,000 to5,999 mAh']")).click();
		}
		}
