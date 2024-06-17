package Selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class streamMap {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Rama");
		names.add("laksmana");
		names.add("sita");
		names.add("Arjun");
		
		//names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//print names which have first letter starts with a and convert to uppercase and print
		
		//names.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		 
		//print names which have first letter as "A" with uppercase and sorted
		List<String> name = Arrays.asList("Raja","Alekhya","Aarav","Maa");
		//name.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//concatenat of stream or merging of 2 different list
	Stream<String> concatenatStream = Stream.concat(names.stream(), name.stream());
	
	//concatenatStream.forEach(s->System.out.println(s));
	//concatenatStream.sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
	//To check whether that element is present in stream or not.
	
	boolean flag = concatenatStream.anyMatch(s->s.equalsIgnoreCase("Maa"));
	System.out.println(flag);
	Assert.assertTrue(flag);
	
	
	//collect
	
	ArrayList<String> names23 = new ArrayList<String>();
	names23.add("Rama");
	names23.add("laksmana");
	names23.add("sita");
	names23.add("Arjun");
	
	List<String> collectList = names23.stream().filter(s->s.startsWith("R")).map(s->s.toUpperCase()).collect(Collectors.toList());
	
	System.out.println(collectList.get(0));
	}
	
	

}
