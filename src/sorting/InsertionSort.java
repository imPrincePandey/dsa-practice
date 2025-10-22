package sorting;

import java.util.*;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {5, 3, 4, 1, 2};
        insertionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

	}
	
	public static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length -1; i++) { // Outer loop
			for (int j = i + 1; j > 0; j--) { // Inner loop
				if (arr[j] < arr[j-1]) { // Compare adjacent elements
					swap(arr, j , j-1);
				} else {
					break;  // Stop when correct place found
				}
			}
		}
	}
	 public static void swap(int[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }

}
