package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFacebookRegistration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/Sheru/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ummersharvaniapm@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Allahf0r");
		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
		driver.quit();
		
	}

}
