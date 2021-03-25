package kata.app;

public class SquareDigitApp {

	public static void main(String[] args) {
		//  square every digit of a number and concatenate them.

	}
	public int squareDigits(int n) {
		 String result = "";
		 
		 while (n != 0) {
			 int digit = n % 10;
			 result = digit * digit + result;
			 n /= 10;
		 }
		 return Integer.parseInt(result);
	}
       
}
