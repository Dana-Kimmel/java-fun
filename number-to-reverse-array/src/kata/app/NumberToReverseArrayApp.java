package kata.app;

import java.util.ArrayList;

public class NumberToReverseArrayApp {

	public static void main(String[] args) {
		int temp = 12345789;
		ArrayList<Integer> array = new ArrayList<Integer>();
		do{
		    array.add(temp % 10);
		    temp /= 10;
		} while  (temp > 0);
		System.out.println(array);
	    }
	}


