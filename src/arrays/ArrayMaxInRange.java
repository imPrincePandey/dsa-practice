package arrays;
import java.util.*;

public class ArrayMaxInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of an array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " element: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			}
		
		// Input range
		System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        
        // Call method
		int maximum = maxRange(arr, start, end); 
		
		System.out.println("Maximum element in Range: " + maximum);
		
		sc.close();

	}
	
	// Method to find max in a given range
	static int maxRange(int[] arr, int start, int end) {
		// Edge cases
		if (arr == null || arr.length == 0) {
            return -1;
        }
		if (start > end) {
			return -1;
		}
		
		
		int maxValue = arr[start];
		for (int i = start; i < end; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		return maxValue;
		
	}

}
