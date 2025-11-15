package strings;

public class ReverseWords {

	public static void main(String[] args) {
		System.out.println(reverseWords("  the   sky  is blue  "));

	}
	
	public static String reverseWords(String s) {
		s = s.trim(); // remove leading & trailing spaces
		String[] words = s.split("\\s+");// split by 1+ spaces
		
		// create stringBuilder
		StringBuilder sb = new StringBuilder();
		
		// reverse string we will start from end of string
		for (int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i]);
			
			if (i != 0) sb.append(" "); // add space except after last word
		}
		
		return sb.toString();
	}

}
