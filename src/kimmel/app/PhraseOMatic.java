package kimmel.app;

public class PhraseOMatic {

	public static void main(String[] args) {
		// from Head First Java book
		// create three String arrays
		String[] wordListOne = { "24/7", "multitier", "ginormous", "B-to-B", "win-win", "front-end", "web-based",
				"pervasive", "smart", "six-sigma", "critical-path", "dynamic" };

		String[] wordListTwo = { "empowered", "sticky", "value-added", "oriented", "centric", "distributed",
				"clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned",
				"targeted", "shared", "cooperative", "accelerated" };

		String[] wordListThree = { "process", "tipping-point", "solution", "architecture", "core competency",
				"strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission" };

		// find out how many words are in each array and assign to a new variable
		// the random() method returns a random number between 0 and not-quite 1 so need
		// to multiply by array.length
		// we have to cast the result into an integer
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		// generate three random numbers from arrays and assign to new variable
		int randomOne = (int) (Math.random() * oneLength);
		int randomTwo = (int) (Math.random() * twoLength);
		int randomThree = (int) (Math.random() * threeLength);

		// build String phrase by concatenating the String objects
		String phrase = wordListOne[randomOne] + " " + wordListTwo[randomTwo] + " " + wordListThree[randomThree] + "!";

		// print out phrase
		System.out.println("What we need is a " + phrase);
	}
}