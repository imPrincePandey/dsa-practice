package strings;

import java.util.Scanner;

public class RotateString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string s: ");
		String s = sc.nextLine();
		
		System.out.println("Enter the String goal: ");
		String goal = sc.nextLine();
		
		boolean result = rotateString(s, goal);
		
		System.out.println("Can s be rotated to form goal? " + result);
		
		sc.close();



	}
	
	public static boolean rotateString(String s, String goal) {
		
		// check If lengths differ, cannot be rotation
		
		if (s.length() != goal.length()) {
			return false;
		}
		
		// Check in concatenated string
		
		String doubled = s + s;
		
		// check if goal is substring of s + s
		
		return doubled.contains(goal);
	}

}
