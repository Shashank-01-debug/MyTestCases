
public class ArrayDemo {

	public static void main(String[] args) {
		int[] marks = new int[5];
		marks[0]=82;
		marks[1]=42;
		marks[2]=63;
		marks[3]=33;
		marks[4]=93;
		//System.out.println(marks[4]);
		
		for(int i=0; i< marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		
		String[] name= {"shashank","ujjawal", "anant", "chittru"};
		System.out.println("Goa trip");
		//for(int i=0;i<name.length;i++) {
			//System.out.println(name[i]);
		//}
		//enhanced for loop.
		//need to write array on right side.and put a colon on between and put variable and datatype on left side.
	for(String s:name) {
		System.out.println(s);
	}
		

	}

}
