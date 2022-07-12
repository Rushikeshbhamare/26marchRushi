package KiteUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener 
{

	WebDriver driver;
	@Override
	public void onTestSuccess(ITestResult result)
	{
Reporter.log("Test Case Is Passed Your Test Case name is "+  result.getName(),true);

	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("Sorry Your Test Case is Failed Your TC Name Is"+ result.getName(),true);
	String Name = result.getName();
		try {
			UtilityProp.captureScreenshot(driver, Name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

