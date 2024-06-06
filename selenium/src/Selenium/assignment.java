package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption2")).click();
		String checkBoxName = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println("first Assignment:"+checkBoxName);
		
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdown);
		s.selectByVisibleText(checkBoxName);
		
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys(checkBoxName);
		driver.findElement(By.id("alertbtn")).click();
		String alertText = driver.switchTo().alert().getText();
		//System.out.println(alertText);
		String desiredText= alertText.split(",")[0].trim().split(" ")[1];
		System.out.println("third Assignment:"+desiredText);
		
		//click alert and then verify if text grabbed from step 2 is present in the popup message or not
		
		if(alertText.contains(checkBoxName)) {
			System.out.println("yes, Text is present");
		}
		else
			System.out.println("No,Text is not present");
		
		driver.close();
		
		
		
		
		
		
		
		
		//driver.close();
		

	}

}
