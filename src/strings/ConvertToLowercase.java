package strings;

import java.util.Scanner;

public class ConvertToLowercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("Output: " + toLowerCase(s));
        
        sc.close();

	}
	
	public static String toLowerCase(String s) {
		//return s.toLowerCase(); // 1-line solution using Java built-in
		
		StringBuilder sb = new StringBuilder();
		
		// Loop through each character
		 for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);

	            if (Character.isUpperCase(ch)) {
	                sb.append(Character.toLowerCase(ch));
	            } else {
	                sb.append(ch);
	            }
	        }
		
		return sb.toString(); // 	
		}

}
