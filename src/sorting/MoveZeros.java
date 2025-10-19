package sorting;

import java.util.Arrays;

// LeetCode Problem: https://leetcode.com/problems/move-zeroes/description/
/*
 * Problem Statement: Move all zeros to the end
                     Keep the order of other (non-zero) elements same
                     Don’t use extra space.
 */

/*
 * Approach: We use two pointer approach
 * here we use j pointer which keep track on next non zero element where they placed
 * also we use i pointer to traverse full array and find where arr[i] != 0, then swap with arr[j] and increase j
 */

public class MoveZeros {

	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        System.out.println("After moving zeros: " + Arrays.toString(arr));

	}
	
	public static void moveZeroes(int [] arr) {
		int j = 0; // Position for next non-zero element
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) { //all non zero element swap with arr[j]
				// Swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++; // increase j so that it would ensure the place of next non zero element
				
			}
		}
	}

}
