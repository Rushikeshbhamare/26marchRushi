package TestNgStudy;

import org.checkerframework.common.util.report.qual.ReportCall;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass {
  @Test
  public void myMethod() throws InterruptedException {
  
  System.setProperty("webdriver.chrome.driver", "F:\\Velocity Class\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://vctcpune.com/selenium/practice.html");
	Reporter.log("hi",true );
	Thread.sleep(2000);
  }
  @Test
  public void myMethod1 () throws InterruptedException {
  
  System.setProperty("webdriver.chrome.driver", "F:\\Velocity Class\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	
	Thread.sleep(2000);
}
}
