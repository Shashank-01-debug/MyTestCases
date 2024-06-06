package GreenKart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i = 0; i <products.size(); i++) {
			
			String name = products.get(i).getText();
			
			if(name.contains("Cucumber")) {
				//when single product is selected and added to cart.
				System.out.println(name);
				//click on add to cart
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				//if there are multiple elements then selenium is unable to click so, we need index.
				break;
			}

		}

	}

}
