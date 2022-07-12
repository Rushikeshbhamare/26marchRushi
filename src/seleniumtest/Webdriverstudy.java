package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverstudy {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Class\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		//driver.close();
		//driver.quit();
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.navigate().to("https://www.google.co.in/");
		//driver.navigate().back();
		System.out.println(driver.getTitle());
		String Title = driver.getTitle();
		System.out.println(Title);
		System.out.println(driver.getCurrentUrl());
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
 
	
	}