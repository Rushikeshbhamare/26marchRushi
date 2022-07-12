package ListenerTest;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener {
		
		@Override
		public void onTestFailure(ITestResult result) {
			
			Reporter.log("Take Screenshot",true);
			Reporter.log("Failed TC Name is " + result.getName());			
		}

		@Override
			public void onTestSuccess(ITestResult result) {
				Reporter.log("Test Passed Successful",true);
				Reporter.log("Success TC Name is " + result.getName());	
			}
			
		@Override
			public void onTestSkipped(ITestResult result) {
				Reporter.log("This test is skipped",true);
				Reporter.log("Skipped TC Name is " + result.getName());	


}
}
