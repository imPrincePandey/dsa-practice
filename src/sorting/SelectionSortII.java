package sorting;

import java.util.Arrays;

// We’ll sort in ascending order by putting the maximum elements at the end in each pass.

public class SelectionSortII {

	public static void main(String[] args) {
		int[] arr = {5, 3, 1, 4, 2};
        selectionSortByMax(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

	}
	
	public static void selectionSortByMax(int[] arr) {
		int n = arr.length;
		
		// start i from right to left means end to start
		for (int i = n - 1; i > 0; i--) {
			int maxValue = 0;
			
			// // Find index of maximum element in range [0..i]
			
			for (int j = 1; j <= i; j++) { 
				
				if (arr[j] > arr[maxValue]) {
					
					maxValue = j;
				}
			}
			// // Swap max element with element at position i
			int temp = arr[i];
			arr[i] = arr[maxValue];
			arr[maxValue] = temp;
		}
	}

}
