package ListenerTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(ListenerTest.Listener.class)
public class MyTestClass2 {
  @Test
  public void myMethod4() {
	  Reporter.log("Hi My name is My Method4" , true);
  }
  @Test
  public void myMethod5() {
	  Assert.fail();
	  Reporter.log("Hi My name is My Method5" , true);
}
  @Test (dependsOnMethods = {"myMethod5"})
  public void myMethod6() {
	 
	  Reporter.log("Hi My name is My Method6" , true);
}
}