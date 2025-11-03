package strings;

// problem statement: Longest Word in a Sentence

public class LongestWordFinder {

	public static void main(String[] args) {
		String sentence = "Learning Java is awesome";
		
		String [] words = sentence.split(" ");
		
		// we will keep two variable
		
		String longestWord = "";
		int maxLength = 0;
		
		// Each iteration checks if the current word is longer than the previously stored one.
		
		for (String word : words) {
			if (word.length() > maxLength) {
				maxLength = word.length();
				longestWord = word;
			}
		}
		
		System.out.println("Longest word: " + longestWord);

	}

}
