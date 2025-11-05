package strings;

//LeetCode Problem: https://leetcode.com/problems/first-unique-character-in-a-string/description/

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		System.out.println(firstUniqChar("leetcode"));
		 System.out.println(firstUniqChar("loveleetcode"));
		 System.out.println(firstUniqChar("aabb")); 

	}
	
	public static int firstUniqChar(String s) {
		//create frequency array
		
		int [] freq = new int [26];
		
		// count frequency
		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i) - 'a'] ++;
		}
		
		// find the first char with frequency 1
		
		for (int i = 0; i < s.length(); i++) {
			if(freq[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}
		return -1;
	}

}
