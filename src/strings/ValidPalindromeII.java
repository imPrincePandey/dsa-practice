package strings;

public class ValidPalindromeII {

	public static void main(String[] args) {
		System.out.println(validPalindrome("abca")); // true
        System.out.println(validPalindrome("abc"));  // false

	}
	
	public static boolean validPalindrome(String s) {
		// take two pointer left and right
		int left = 0;
		int right = s.length() -1;
		
		while (left < right) {
			// check character is match
			if (s.charAt(left) == s.charAt(right)) {
				left++;
				right--;
			} 
			
			// if not match skipping either left or right character
			else {
				return checkPalindrome(s, left + 1, right) ||
						checkPalindrome(s, left, right -1);
			}
		}
		
		
		
		return true;
	}

	private static boolean checkPalindrome(String s, int left, int right) {
		while (left < right) {
			// check if character is not maching
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
