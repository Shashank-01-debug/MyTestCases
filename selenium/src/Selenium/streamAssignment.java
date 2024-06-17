package Selenium;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class streamAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sort the numbers
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
                     List<Integer> numbers = Arrays.asList(5,6,2,7,5,3);
                     //numbers.stream().sorted().forEach(s->System.out.println(s));
                     //print unique number from this array
              List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
             //   distinctNumbers.stream().sorted().forEach(s->System.out.println(s));
                driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
                driver.findElement(By.xpath("//a[@class='cart-header-navlink'][1]")).click();
                
                Set<String> window = driver.getWindowHandles();
                Iterator<String> it = window.iterator();
                String window1 = it.next();
              String window2 =  it.next();
              driver.switchTo().window(window2);
              
              driver.findElement(By.xpath("//th[@role='columnheader'][1]")).click();
             List<WebElement> veggies = driver.findElements(By.xpath("//tr//td[1]"));
           List<String> originalList = veggies.stream().map(s->s.getText()).collect(Collectors.toList());
           List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
           Assert.assertTrue(originalList.equals(sortedList));
              
              
                
                
                
	}

}
