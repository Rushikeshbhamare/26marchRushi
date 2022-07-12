package WebelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselecteduse {

			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "F:\\Java Classes\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://vctcpune.com/selenium/practice.html");
				Thread.sleep(5000);
				
				WebElement checkbox1 = driver.findElement(By.name("checkBoxOption1"));
				
				if (checkbox1.isSelected())
				{
				System.out.println("Checkbox1 Is Already Selected");
				}
				else 
				{
					checkbox1.click();
					System.out.println("checkbox is now selected");
				}


	}

}
