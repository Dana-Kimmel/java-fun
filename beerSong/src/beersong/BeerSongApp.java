package beersong;

public class BeerSongApp {
//from Head First Java
	public static void main(String[] args) {
	int beerNum = 99;
	String bottle = "bottles";
	
	while (beerNum > 0) {
		
		if (beerNum == 1) {
			bottle = "bottle"; // singular 
			
		}
		
		System.out.println(beerNum + " " + bottle + " of beer on the wall.");
		System.out.println(beerNum + " " + bottle + " of beer.");
		System.out.println("Take one down.");
		System.out.println("Pass it around.");
		beerNum = beerNum - 1;
		
		if(beerNum > 0) {
			System.out.println(beerNum + " " + bottle + " of beer on the wall.");
		} else {
			System.out.println("No more bottles of beer on the wall");
		}
	}
	}

}
