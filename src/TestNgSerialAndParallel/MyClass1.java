package TestNgSerialAndParallel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class MyClass1 {
	@Test
	 public void myMethod()
	 {
	System.setProperty("webdriver.chrome.driver", "F:\\Velocity Class\\chromedriver.exe");
	RemoteWebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");

  }
}
