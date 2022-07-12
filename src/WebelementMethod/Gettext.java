package WebelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Java Classes\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//a[@class='navbar-brand font-weight-bold text-white']")).getText());
		 //WebElement element = driver.findElement(By.xpath("//a[@class='navbar-brand font-weight-bold text-white']"));
		 //System.out.println(element.getText());
		

	}

}
