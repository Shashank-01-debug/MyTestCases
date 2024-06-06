import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylistDemo {
	
//ArrayList is dynamic array we can change the count of elements on the go.


	public static void main(String[] args) {
		//convert array to arraylist
		
		
		String[] name = {"dada","anna","chuha","chittru"};
	//Arrays is a class in java.
		//Arrays.asList(name); array is converted in arraylist now need to give variable
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("dada"));
		
		
		
		
		ArrayList <String>al = new ArrayList<String>();
		al.add("Shashank");
		al.add("Raaaana Pratap");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		//enhanced for loop
		
	/*	for(String val:al)
		{
			System.out.println(val);			
		}
	*/
		//System.out.println(al.contains("Shashank"));

	}

}
