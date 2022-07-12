package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class MyFirstSeleniumCode {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Class\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		
		
		
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rushibhamare3888@gmail.com");
//		
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rushi@3888");
//		driver.findElement(By.xpath("//button[@name='login']")).click();
//		driver.findElement(By.xpath("//h2[contains(text(),'in your life')]"));
		
		

	}

}
