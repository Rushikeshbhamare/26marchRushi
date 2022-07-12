package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import WebelementMethod.sendkeysuse;

public class FacebookAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Java Classes\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		 driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
		 Thread.sleep(1000);
		 
		WebElement firstname = driver.findElement(By.xpath("//input[@aria-label='First name']")); Thread.sleep(500);
		firstname.sendKeys("Rushi"); 
		WebElement Lastname = driver.findElement(By.xpath("//input[@name='lastname']"));Thread.sleep(500);
		Lastname.sendKeys("BHAMARE");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9767503888"); Thread.sleep(500);
		
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Rushi@3888"); Thread.sleep(500);
		

		WebElement listbox = driver.findElement(By.name("birthday_day"));
		Select s= new Select(listbox);
		s.selectByValue("10");
		
		WebElement Listbox1 = driver.findElement(By.name("birthday_month"));
		Select s1= new Select(Listbox1);
		s1.selectByValue("11");
		
		WebElement Listbox2 = driver.findElement(By.name("birthday_year"));
		Select s2= new Select(Listbox2);
		s2.selectByValue("1996");
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	}

}