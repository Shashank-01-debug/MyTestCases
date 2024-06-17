package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class invokeMultipleTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*scenario
		navigate to https://rahulshettyacademy.com/angularpractice/
		fill the "Name" field with the first course name available at
		https://rahulshettyacademy.com*/
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		//through switchTo() method driver focus shifts to new window.
		driver.switchTo().window(childId);
		driver.get("https://rahulshettyacademy.com/");
		String text = driver.findElement(By.xpath("//a[text()='All-Access Membership-Complete Access to 25+ Courses (and counting!)']")).getText();
		driver.switchTo().window(parentId);
		driver.findElement(By.name("name")).sendKeys(text);
	
		

	}

}
