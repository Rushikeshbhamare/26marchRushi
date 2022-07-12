package TestNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodsDependsOnUse {
	@Test(invocationCount = 2)
	 public void d() 
	 {
	//Assert.fail();
	Reporter.log("d is running",true);
	 }
	 @Test(dependsOnMethods = {"d"}, priority =- 2)
	 public void a()
	 {
	 Reporter.log("a is running",true);
	 }
	 @Test
	 public void v()
	 {
	 Reporter.log("v is running",true);
  }
}
