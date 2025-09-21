package arrays;

import java.util.*;

public class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Size of Array: ");
		int n = sc.nextInt();
		
		int [] arr = new int [n];
		
		// Input array elements
		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		 // swapping element at index 1 and index 3
		swap(arr, 1, 3);
		
		// Print result
		System.out.println("Swapped Array is: " + Arrays.toString(arr));
		sc.close();
	}
		
		// create a method for swap
		
		static void swap (int[] arr, int index1 , int index2) {
			int temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
			
		}

	

}
