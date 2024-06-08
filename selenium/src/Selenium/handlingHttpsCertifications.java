package Selenium;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handlingHttpsCertifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     	 Proxy pr = new Proxy();
     	 pr.setHttpProxy("4443432");
	
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		options.setCapability("proxy", pr);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);//here we need to pass object of ChromeOptions class.
		driver.manage().window().maximize();
		//this website is not working so to access this certificate we use ChromeOptions class
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

	}

}
