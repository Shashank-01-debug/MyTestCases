package testNGTutorial;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener is interface which implements testNG listeners
public class listenersDemo implements ITestListener{
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("executed successfully." +result.getName());
		
		
		
		
	}
	
	
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("test got fail");
	}

	
}
