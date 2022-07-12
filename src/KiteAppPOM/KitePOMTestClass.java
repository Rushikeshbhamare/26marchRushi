package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KitePOMTestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Class\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		KiteLoginPage login=new KiteLoginPage(driver);
		login.sendUserName();
		login.sendPassword();
		login.clickOnLoginButton();
		Thread.sleep(2000);
		KitePinPage PIN = new KitePinPage(driver);
		PIN.sendPin();
		PIN.ClickonContinuebutton();
		Thread.sleep(2000);
		KiteHomepage home= new KiteHomepage(driver);
		home.validateUserName();
		home.logOutButton();
		driver.close();
	
	}
	
	

}
