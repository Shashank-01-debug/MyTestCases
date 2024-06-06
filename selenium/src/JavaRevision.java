
public class JavaRevision {

	public static void main(String[] args) {
	
		int[] marks = {19,12,13,18,22,24,23};
		//check if whole array has any integer which is multiple of 2. if its exist then 
		//come out of loop and don't print any other integer.
		//print all those marks which are multiples of 2.
		//i.e 12,18,22,24
		
		for(int i=0;i<marks.length;i++) {
			if(marks[i]%2==0)
			{
			System.out.println(marks[i]);
			break;
			}
			else {
				System.out.println(marks[i]+"  is not multiple of 2.");
			}
		}
		
		
	}

}
