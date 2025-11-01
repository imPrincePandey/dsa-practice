package strings;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		String input = "Prince";
        countVowelsAndConsonants(input);

	}
	
	public static void countVowelsAndConsonants(String str) {
		int vowel = 0;
		int consonent = 0;
		
		// change string into lowercase
		str = str.toLowerCase();
		
		for (int i = 0; i < str.length(); i++) {
			// Return char at index
			char ch = str.charAt(i);
			
			// to determine if character is a letter
			if(Character.isLetter(ch)) { // step 2: ignore digits/spaces
				
				// check vowel
				if (ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u') {
					vowel++;
				} else {
					consonent++;
				}
				
			}
		}
		
		System.out.println("Vowels: " + vowel);
		System.out.println("Consonants: " + consonent);
	}

}
