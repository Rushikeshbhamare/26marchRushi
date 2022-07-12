package KiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class UtilityProp {

	public static String getDataFromPropertyFile(String key) throws IOException
	{
	Properties prop= new Properties();// created object of properties 
	FileInputStream myfile= new FileInputStream("C:\\Users\\RUSHIKESH\\eclipse-workspace\\Rushi Selenium\\Propertiies.properties");
	prop.load(myfile);
	String value = prop.getProperty(key);
	return value;
	}
	public static void captureScreenshot(Object driver, String TCID) throws
	IOException
	{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest= new File("F:\\Velocity Class\\Screenshot"+TCID+".png");
	FileHandler.copy(src, dest);
	}
}
 
