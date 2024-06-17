package testNGTutorial;

import org.testng.annotations.Test;

public class personalLoan {

	@Test
	public void webLogInpersonalLoan() {
		
		System.out.println("web personal loan");
		
		
	}

	@Test(groups={"smoke"})
	public void mobileLoginpersonalLoan() {
		System.out.println("mobile personal loan");
		
	}
	@Test
	public void ApiLoginpersonalLoan() {
		System.out.println("API personal loan");
	}

	

}
