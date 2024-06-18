package testNGTutorial;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class personalLoan {





	@Test(dataProvider="getData")
	public void webLogInpersonalLoan(String username,String password) {
		
	//	System.out.println("web personal loan");
		System.out.println(username);
		System.out.println(password);
		
	}

	@Test//(groups={"smoke"})
	public void mobileLoginpersonalLoan() {
		System.out.println("mobile personal loan");
		
	}
	//this test will wait for 4 seconds. if after that it is not executed then it will throw error.
	@Test//(timeOut=4000)
	public void ApiLoginpersonalLoan() {
		System.out.println("API personal loan");
	}



@DataProvider
public Object[][] getData() {
	
	//different type of users
	//1st combination-- good credit history
	//2nd combination-- no credit history.
	//3rd combination-- fraudlent credit history.
	//create multi dimensional array.
	//row is decided as how many combinations you have.
	//column is decided as how many values are passing in one go. here values are username and password.
	 Object[][] data = new Object[3][2];
	 data[0][0]="firstsetusername";
	 data[0][1]="firstsetpassword";
	 //2nd set
	 data[1][0]="secondsetusername";
	 data[1][1]="secondsetpassword";
	 //3rd set
	 data[2][0]="thirdsetusername";
	 data[2][1]="thirdsetpassword";
	 
	 return data;
	
	
}







}
