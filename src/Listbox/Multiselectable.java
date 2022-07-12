package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Java Classes\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(5000);
		
		WebElement mutliSelectElement = driver.findElement(By.name("cars"));

		Select s= new Select(mutliSelectElement);
		
		System.out.println("Multi Select status is "+s.isMultiple());
		
		s.selectByVisibleText("Volvo");
		Thread.sleep(100);
		s.selectByValue("saab");
		Thread.sleep(100);
		s.selectByIndex(2);
		Thread.sleep(100);
		s.selectByIndex(3);
		
		//s.deselectAll();
		Thread.sleep(100);
		s.deselectByIndex(3);
		Thread.sleep(100);
		s.deselectByIndex(2);
		Thread.sleep(100);
		s.deselectByValue("saab");
		
		
		System.out.println(s.getFirstSelectedOption().getText());
		
		s.getAllSelectedOptions();
	}

}
