package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class brokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//broken links are nothing but broken URL.
		//step 1- is to get all urls tied up to the links using selenium.
		
		//java methods will call URL's and gets you the status code.
		//status code over 400 are usually the broken URL.

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	/*	String url = driver.findElement(By.cssSelector("a[href*='broken']")).getAttribute("href");
		System.out.println(url);
	//	driver.findElement(By.cssSelector("a[href='https://rahulshettyacademy.com/brokenlink']")).click();
		
	HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
	//URL is class and openConnection is a method.
	//HTTpURLConnection is a typecast
	conn.setRequestMethod("HEAD");
	conn.connect();
	int responseCode = conn.getResponseCode();
	System.out.println(responseCode);
	*/
		
	
	
	List<WebElement> urls = driver.findElements(By.cssSelector("li[class='gf-li']"));
	
	for(int i=0;i<urls.size();i++)
	{
		String link = driver.findElement(By.cssSelector("li[class='gf-li']")).getAttribute("href");
		System.out.println(link);
	}
	
	
	
		
	}

}
