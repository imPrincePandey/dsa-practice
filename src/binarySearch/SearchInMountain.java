package binarySearch;
import java.util.*;

public class SearchInMountain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		
		System.out.println("Enter " + n + " element: ");
		int[] arr = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the Target: ");
		int target = sc.nextInt();
		
		System.out.println("Output: " + findInMountainArray(target, arr));
		
		sc.close();

	}
	
	/*
	 * Approach: We first find the peak using a binary search (to split array into two halves).
	 * Then we do:

                Binary search 1: on ascending part [0 ... peak]

                Binary search 2: on descending part [peak+1 ... end]
                
                For searching ascending and descending in same array we need to use one general function for both
                which is order-agnostic (i.e., “it doesn’t care about the order”).
                function name is: -> orderAgnosticBinarySearch
	 */
	
	public static int findInMountainArray(int target, int[] arr) {
		int peak = findPeakIndex(arr);
		// Search in the ascending part
		int firstTry = orderAgnosticBinarySearch(arr, target, 0 , peak);
		if (firstTry != -1) {
			return firstTry;
		} else { // Search in the descending part
			return orderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1);
		}
		
	}
	 // Step 1: Find the peak index
	private static int findPeakIndex(int[] arr) {
		int low = 0;
		int high = arr.length -1;
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] > arr[mid + 1]) { // You are in the descending part (peak may be mid or to the left)
				high = mid;
				
			} else {
				// You are in ascending part (peak is to the right)
				low = mid + 1;
			}
		}
		// at the end low == high -> pointing to a peak element
		return low;
	}
	
	// This binary search automatically adjusts for ascending or descending order
	
	private static int orderAgnosticBinarySearch(int [] arr,int target, int low, int high) {
		
		boolean isAscending = arr[low] < arr[high]; // Check order
		
		while (low <= high) {
			int mid = low + (high - low) / 2;
			// simple binary search
			if (arr[mid] == target) {
				return mid;
			}
			if (isAscending) { // If ascending part
				if (target > arr[mid]) { //search in right half
					low = mid + 1;
				} else {
					high = mid - 1;
				}
				
			} else { // if descending part
				// Reverse the logic, because numbers decrease:
				if (target < arr[mid] ) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
				
			}
		}
		return -1;
	}

}
