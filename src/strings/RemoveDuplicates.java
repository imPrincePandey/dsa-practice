package strings;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(removeDuplicates("abbaca")); // Output: "ca"

	}
	
	public static String removeDuplicates(String s) {
		// use stringBuilder
		StringBuilder sb = new StringBuilder();
		
		for (char ch : s.toCharArray()) {
			// check is StringBuilder is empty or not
			// and also check last character == ch then remove duplicate
			
			if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ch) {
				sb.deleteCharAt(sb.length() - 1); // remove duplicate
			} else {
				sb.append(ch); //  add new char
			}
		}
		return sb.toString();
	}

}
