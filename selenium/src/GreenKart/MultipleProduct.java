package GreenKart;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] veggies = {"Cucumber","Banana"};
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++) {
			
			String[] requiredVeggies = products.get(i).getText().split("-");
			String formattedName = requiredVeggies[0].trim();
			
			System.out.println(formattedName);
			//format output so that it will not show weight with vegetables.
			//Brocolli-1 kg to Brocolli.
			//we need to check whether name we want to extract is present in array or not?
			//so, we convert this array into arraylist.
			
		List itemNeededList= Arrays.asList(veggies);
		
		if(itemNeededList.contains(formattedName)) {
			
			driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			
		}
			
		}
		
		
		
		

	}

}
