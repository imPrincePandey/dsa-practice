package strings;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {

	public static void main(String[] args) {
		 String str = "programming";
		 
		 Map<Character, Integer> freq = new HashMap<>();
		 
		 for (int i = 0; i < str.length(); i ++) {
			 char ch = str.charAt(i);
			 
			 if (freq.containsKey(ch)) {
				 freq.put(ch, freq.get(ch) + 1);
			 } else {
				 freq.put(ch, 1);
			 }
		 }
		 for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
	            System.out.println(entry.getKey() + " -> " + entry.getValue());
	        }

	}

}
