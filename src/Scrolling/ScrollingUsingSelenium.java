package Scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUsingSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Class\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		Thread.sleep(2000);
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000)); //500
		JavascriptExecutor e = (JavascriptExecutor)driver;
		e.executeScript("window.scrollBy(90,800)");


	}

}
