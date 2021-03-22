package kata.app;

public class FindOppositeApp {

	public static void main(String[] args) {
		int num = 6;
		System.out.println(opposite(num));

	}
	 public static int opposite(int number)
     {
         return Math.negateExact(number);
     }

}
