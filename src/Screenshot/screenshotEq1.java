package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshotEq1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Class\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		String str =RandomString.make(5);
		File destination = new File ("F:\\Java Classes\\Screenshot\\ScreenShot1"+str+".png");
		
		FileHandler.copy(source, destination);

	}

}
