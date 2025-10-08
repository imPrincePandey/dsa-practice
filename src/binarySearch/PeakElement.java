package binarySearch;

import java.util.*;

// LeetCode Problem: https://leetcode.com/problems/find-peak-element/description/

public class PeakElement {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		
		
		int[] arr = new int[n];
		
		System.out.println("Enter " + n + " element: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int result = findPeakElement(arr);
        System.out.println("Peak index in array: " + result);
		
		sc.close();

	}
	
	
	public static int findPeakElement(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // You are in the descending part (peak may be mid or to the left)
                high = mid;
            } else {
                // You are in ascending part (peak is to the right)
                low = mid + 1;
            }
        }

        // low == high -> pointing to a peak element
        return low;
	}

}
