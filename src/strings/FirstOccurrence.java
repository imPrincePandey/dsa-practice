package strings;

public class FirstOccurrence {

	public static void main(String[] args) {
		String haystack = "hello";
		String needle = "ll";
		
		System.out.println(strStr(haystack,needle));
		

	}
	
	public static int strStr(String haystack, String needle) {
		
		int n = haystack.length();
		int m = needle.length();
		
		if (m > n) { // impossible to match
			return -1;
		}
		
		for (int i = 0; i <= n - m; i++) {
			int j = 0; // take pointer to check substring match
			
			while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
				j++;
			}
			 
			if (j == m) {
				return i;
			}
		}
		
		return - 1;
	}

}
