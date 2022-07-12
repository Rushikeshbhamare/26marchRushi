package TestNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCcount {
	@Test(invocationCount = 2)
	 public void myTest() 
	 {
	 Reporter.log("Hello",true);
	 }
	 
	 @AfterMethod
	 public void test()
	 {
	 Reporter.log("Hi",true);
  }
}
