package strings;

public class CountVowelsConsonantsEachWord {

	public static void main(String[] args) {
		String input = "Learning Java is awesome";
        countVowelsAndConsonantsPerWord(input);

	}
	
	public static void countVowelsAndConsonantsPerWord(String str) {
		
		// Split sentence into words
		String [] words = str.split(" ");
		
		for (String word : words) {
		int vowelCount = 0;
		int consonantCount = 0;
		
		// convert into lowerCase
		word = word.toLowerCase();
		
		for (int i = 0; i < word.length(); i++) {
			// identify each character in string
			
			char ch = word.charAt(i);
			
			// check if it is a letter
			if(Character.isLetter(ch)) {
			
				// check vowel
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelCount++;
				} else {
					consonantCount++;
				}
			}
		}
		
		
		
		
		System.out.println("Word: " + word +
                " -> Vowels: " + vowelCount +
                ", Consonants: " + consonantCount);
		
		}
		
	}

}
