package testNGTutorial;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class testDemo {
	
	
	
	
	@Parameters({"roy"})
	@Test
	public void demo(@Optional("defaultValue")String uname) 
	{
		
		System.out.println("hey, welcome to testNG tutorial.");
		System.out.println(uname);
		
		
	}

	
}
