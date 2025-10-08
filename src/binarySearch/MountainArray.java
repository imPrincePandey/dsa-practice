package binarySearch;

import java.util.*;

// LeetCode problem: https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

public class MountainArray {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		
		
		int[] arr = new int[n];
		
		System.out.println("Enter " + n + " element: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int result = peakIndexInMountainArray(arr);
        System.out.println("Peak index in mountain array: " + result);
		
		sc.close();

	}
	
	public static int peakIndexInMountainArray(int[] arr) {
		int low = 0;
		int high = arr.length-1;
		while (low < high) {
			int mid = low + (high - low) / 2;
			
			if (arr[mid] > arr[mid + 1]) {
				
				// arr[mid] > arr[mid + 1]  mid is in the decreasing part (possible peak)
				// so we move 'high' = mid instead of mid - 1 to include mid as potential answer
				high = mid;
			} else {
				// you are in ascending part of an array so
				low = mid + 1; // because we know that mid+1 element > mid element
			}
		}
		// in the end low is going to low == high pointing to the largest number
		return low;
	}

}
