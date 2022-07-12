package ListenerTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(ListenerTest.Listener.class)
public class MyTestClass {
  @Test
  public void myMethod1() {
	  Reporter.log("Hi My name is My Method1" , true);
  }
  @Test
  public void myMethod2() {
	  Assert.fail();
	  Reporter.log("Hi My name is My Method2" , true);
}
  @Test (dependsOnMethods = {"myMethod2"})
  public void myMethod3() {
	 
	  Reporter.log("Hi My name is My Method3" , true);
}
}