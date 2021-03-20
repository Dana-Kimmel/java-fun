package C3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		 try {
		      File myObj = new File("precincts.txt");
		      Scanner myReader = new Scanner(myObj);
		     
		      List<BufferedWriter> output = new ArrayList<BufferedWriter>();
		      for(int I = 0; I < 27; I++) {
		      output.add(new BufferedWriter(new FileWriter(I+".txt")));
		      }

		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      // for loop to close all output buffers
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    } catch (IOException e) {
				
				e.printStackTrace();
			}

	}

	public static List<Integer> sortNumbers(List<Integer> numbers) {
		numbers.sort(Comparator.naturalOrder());
		return numbers;
	}

	public static void method1() {
		System.out.println("Hi there");
	}

}
