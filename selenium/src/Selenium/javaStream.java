package Selenium;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class javaStream {
  @Test
  public void streamFilter() {
	  
	ArrayList<String> name =  new ArrayList<String>();
	name.add("Ashish");
	name.add("Radha");
	name.add("Anjali");
	
	long co = name.stream().filter(s->s.startsWith("A")).count();
	System.out.println("Names start with Alphabet:" +co);
	  
  }
}
