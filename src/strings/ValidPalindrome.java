package strings;

public class ValidPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama")); 
        System.out.println(isPalindrome("race a car")); 

	}
	
	public static boolean isPalindrome(String s) {
		
		int left = 0, right = s.length() - 1;

        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);

            // Skip non-alphanumeric characters
            if (!Character.isLetterOrDigit(l)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(r)) {
                right--;
                continue;
            }

            // Compare (case-insensitive)
            if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
	}

}
