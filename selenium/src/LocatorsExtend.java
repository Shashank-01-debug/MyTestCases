import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocatorsExtend {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	LocatorsExtend le =	new LocatorsExtend();
		le.getpassword(driver);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("shashank");
		driver.findElement(By.cssSelector("input[type*=pass]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
	Assert.assertEquals((driver.findElement(By.tagName("p")).getText()),"You are successfully logged in." );
	Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(), "Hello shashank,");
	System.out.println("testcase pass.");
	driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	System.out.println("logout");
	driver.close();
		
	}
	
	public String getpassword(WebDriver driver) throws InterruptedException 
	
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	String passwordText =	driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
	//Please use temporary password 'rahulshettyacademy' to Login.
	
	String[] passwordarray = passwordText.split("'");
	//0th index- please use temporary password.
	//1st index- rahulshettyacademy' to login
	
	//0th index - rahulshettyacademy
	//1st index - to login
	
	String password= passwordarray[1].split("'")[0]; 
	
	return password;

	
	
	}

}
