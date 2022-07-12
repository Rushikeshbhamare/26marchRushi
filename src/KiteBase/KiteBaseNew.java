package KiteBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import KiteUtility.UtilityProp;

public class KiteBaseNew {

WebDriver driver;
public void openBrowser() throws IOException {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notification");
	System.setProperty("webdriver.chrome.driver", "F:\\Velocity Class\\chromedriver.exe");
driver= new ChromeDriver(options);
driver.manage().window().maximize();
driver.get(UtilityProp.getDataFromPropertyFile("URL"));

Reporter.log("Launching browser",true);
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
}
}
