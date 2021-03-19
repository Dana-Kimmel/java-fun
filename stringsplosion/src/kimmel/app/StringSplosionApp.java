package kimmel.app;

public class StringSplosionApp {

	public static void main(String[] args) {
		String result = stringSplosion("Code");
		System.out.println(result);

	}
 public static String stringSplosion(String str) {
	// get length of string
	 int length = str.length();
	 String result = "";
	 
	 //use a for loop to go through each character in the array.
	 for (int i = 0; i < length + 1; i++)
		 result += str.substring(0, i);

	 return result;
 }
}
