package testNGTutorial;

import org.testng.annotations.Test;

public class login {
//by using enabled=false this testcase will not be executed.
	@Test(enabled=false)
	public void webLogInCarLoan() {
		
		System.out.println("web car loan");
		
		
	}

	@Test
	public void mobileLoginCarLoan() {
		System.out.println("mobile car loan");
		
	}
	@Test(groups={"smoke"})
	public void ApiLoginCarLoan() {
		System.out.println("API car loan");
	}
	
}
