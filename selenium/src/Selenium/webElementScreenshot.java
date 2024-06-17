package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Take the screenshot of webElement
public class webElementScreenshot {

	public static void main(String[] args) throws IOException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement textField = driver.findElement(By.name("name"));
		textField.sendKeys("Core Java");
		File file = textField.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("E:\\TV series\\webElement.png"));
		
		
		

	}

}
