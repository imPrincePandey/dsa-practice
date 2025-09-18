package arrays;
import java.util.*;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		
		// Array of primitive		 		
		/*
		 * int [] arr = new int[n];
		System.out.println("Please Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Original array: " + Arrays.toString(arr)); // is an inbuilt method in Java
		// it converts the array into a human-readable string.
		
		
		*/
		
		
		
		// Array of object
		System.out.println("Please Enter " + n + " element");
		String [] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = sc.next();
		}
		System.out.println("Original array: " + Arrays.toString(str));
		
		sc.close();
	}

}
