package strings;

public class CapitalizeTitle {

	public static void main(String[] args) {
		 System.out.println(capitalizeTitle("capiTalIze tHe titLe"));

	}
	
	public static String capitalizeTitle(String title) {
		// split sentence into word
		
		String [] words = title.split(" ");
		
		// make StringBuilder
		
		StringBuilder sb = new StringBuilder();
		
		for (String word : words) {
			if (word.length() <= 2) { // if word is less then 2 keep these word in lowerCase
				sb.append(word.toLowerCase());
				
			}
			else {
				 // capitalize first letter, rest lowercase
                String first = word.substring(0, 1).toUpperCase();
                String rest = word.substring(1).toLowerCase();
                sb.append(first).append(rest);
			}
			sb.append(" ");
		}
		return sb.toString().trim();
	}

}
