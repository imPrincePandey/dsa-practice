package dutchNationalFlag;

import java.util.Arrays;

// LeetCode Problem: https://leetcode.com/problems/sort-colors/description/

/*
 * problem statement: int[] nums = {2, 0, 2, 1, 1, 0}; You must sort it so that:
 * All 0s (red) come first , Then 1s (white), Then 2s (blue).
 * So we use Dutch National Flag Algorithm which say that We are not searching for a value — we are partitioning elements into 3 groups:
 * we take low, mid , high as pointer 
 *  It uses three pointers to group the elements in place: 
 *  a low pointer for the beginning of the 0s, 
 *  a mid pointer to iterate through the array, 
 *  and a high pointer for the end of the 2s
 */

public class SortColors {

	public static void main(String[] args) {
		int [] arr = {2, 0, 2, 1, 1, 0};
		sortColors(arr);
		System.out.println("Sorted Array: " + Arrays.toString(arr));

	}
	
	public static void sortColors(int[] arr) {
		int low = 0, mid = 0, high = arr.length - 1;
		
		while (mid <= high) {
			if (arr[mid] == 0) {
				// // swap arr[low] and arr[mid]
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
			} else if (arr[mid]== 1) {
				// just move forward:
				mid++;
			} else { // arr[mid] == 2
				// swap arr[mid] and arr[high]

				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
		}
		
	}

}
