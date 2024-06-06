import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StringDemo {

	public static void main(String[] args) {
		String s= "Police service is better than IAS service";
		String s1= "Ajay";
		
		String s2 = new String("welcome");
		String s3= new String("welcome");
		
		String[] splittedString =s.split("is");
		
	//	for(int i=0;i<s.length();i++) {
			//System.out.println(splittedString[i]);
		//	System.out.println(splittedString[i].trim());
		

	//for(int i=0;i<s.length();i++) {
		
		//System.out.println(s.charAt(i));
	//}
		//print string in reverse order
	for(int i=s.length()-1;i<s.length();i--)
	{
		System.out.println(s.charAt(i));
	}
	}

}
