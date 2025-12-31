package strings;

// LeetCode problem: given String s remove all adjacent pair where one is upperCase and other is lowerCase

public class MakeStringGreat {

	public static void main(String[] args) {
		
		System.out.println(makeGood("leEeetcode"));



	}
	
	public static String makeGood(String s) {
		StringBuilder sb = new StringBuilder();
		
		// change String into character 
		for (char ch : s.toCharArray()) {
			
			// check StringBuilder are empty or not 
            // and also check if current char and top of stack char is same but different case then remove.
			
			if (sb.length() > 0 && Math.abs(sb.charAt(sb.length() - 1) - ch) == 32) {
				sb.deleteCharAt(sb.length() - 1);
			} else {
				sb.append(ch);
			}
		}
		return sb.toString();
	}

}
