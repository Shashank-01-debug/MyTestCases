package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsManage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
	Iterator<String> it = windows.iterator();
			String parentid = it.next();
	        String childid = it.next();
	        
	        driver.switchTo().window(childid);
	        
	       String emailid = driver.findElement(By.cssSelector("p.im-para.red")).getText().split("@")[1].trim().split(" ")[0];
	        driver.switchTo().window(parentid);
	        driver.findElement(By.id("username")).sendKeys(emailid);
	
		
		
		
		

	}

}
