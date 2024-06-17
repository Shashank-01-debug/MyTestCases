package Selenium;

import java.util.ArrayList;
import java.util.stream.Stream;

public class jStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> name =  new ArrayList<String>();
		name.add("Ashish");
		name.add("Radha");
		name.add("Anjali");
		
		long co = name.stream().filter(s->s.startsWith("A")).count();
		//Step1: name.stream() We create the stream.
		//step2:filter() intermediate operation
		//step3: .count() terminal operation.
		
		System.out.println("Names start with Alphabet:" +co);
		//there is no life for intermediate operation if there is no terminal operation
		//terminal operation will execute only if inter op(filter) returns true.
		long total = Stream.of("Ashish","Radha","Anjali").filter(s->s.startsWith("A")).count();
		 System.out.println(total);
		 
		 //print all the names which are larger than 4 words
		 //this programme will give all the results of names which are larger than 5 alphabets.
		 name.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));
		 
		 //print only one name which have more than 5 alphabets.
		 
		 name.stream().filter(s->s.length()>5).limit(1).forEach(s->System.out.println(s));
		 
		
		
	}

}
