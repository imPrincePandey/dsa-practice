package strings;

// leetCode problem : https://leetcode.com/problems/valid-anagram/description/

public class ValidAnagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("anagram", "nagaram")); 
        System.out.println(isAnagram("rat", "car")); 

	}
	
	public static boolean isAnagram(String s, String t) {

        // check if length is not equal 
        if (s.length() != t.length()) return false;

        // create int[26] array
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++; // count in s
            freq[t.charAt(i) - 'a']--; // subtract count in t
        }

        // check if all elements are 0

        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
        
    }

}
