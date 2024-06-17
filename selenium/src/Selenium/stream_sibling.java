package Selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class stream_sibling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.findElement(By.xpath("//a[@class='cart-header-navlink'][1]")).click();
        
        Set<String> window = driver.getWindowHandles();
        Iterator<String> it = window.iterator();
        String window1 = it.next();
      String window2 =  it.next();
      driver.switchTo().window(window2);
      //scan the column with text() Rice
      //print the price of the rice.
      //pagenation concept
      List<String> price;
      
      do {
     List<WebElement> veggies = driver.findElements(By.xpath("//tr//td[1]"));
      price = veggies.stream().filter(s->s.getText().contains("Chocolate")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
      price.forEach(s->System.out.println(s));
      
      if(price.size()<1) //no search is find for you.
      { 
		driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
      
	}
      }while(price.size()<1);
      
      }
	private static String getPriceVeggie(WebElement s) {
	String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
	//half of xpath we already used in line 31 so we used only half here.
	return pricevalue;
		
	}

}
