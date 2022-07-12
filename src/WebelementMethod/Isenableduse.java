package WebelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenableduse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Java Classes\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		WebElement GetOtpButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		System.out.println(GetOtpButton.isEnabled());
		
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9767503888");
		Thread.sleep(5000);
		System.out.println(GetOtpButton.isEnabled());

	}

}
