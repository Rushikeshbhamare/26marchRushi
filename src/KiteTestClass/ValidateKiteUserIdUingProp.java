package KiteTestClass;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import KiteAppPOM.KiteHomepage;
import KiteAppPOM.KiteLoginPage;
import KiteAppPOM.KitePinPage;
import KiteBase.KiteBaseNew;
import KiteUtility.UtilityProp;

@Listeners(KiteUtility.Listener.class)
public class ValidateKiteUserIdUingProp extends KiteBaseNew {
	 
KiteHomepage home;
KiteLoginPage login;
KitePinPage pin;
String TCID="555";
@BeforeClass
public void launchBrowser() throws IOException
{
openBrowser();
login= new KiteLoginPage(driver);
pin= new KitePinPage(driver);
home= new KiteHomepage(driver);
}
@BeforeMethod
public void loginToKiteApp() throws EncryptedDocumentException, IOException
{
login.sendUserName(UtilityProp.getDataFromPropertyFile("UN"));
login.sendPassword(UtilityProp.getDataFromPropertyFile("PWD"));
login.clickOnLoginButton();
pin.sendPin(UtilityProp.getDataFromPropertyFile("PIN"));
pin.ClickonContinuebutton();
}
@Test
 public void validateUserID() throws EncryptedDocumentException, IOException
{
Assert.assertEquals(home.getActualUserName(), UtilityProp.getDataFromPropertyFile("UN"));


}
@AfterMethod
public void logOutFromKite() throws InterruptedException
{
home.logOutButton();
}
@AfterClass
public void closeBrowser()
{
driver.close();
}
}
