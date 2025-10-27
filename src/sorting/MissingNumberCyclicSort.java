package sorting;



// LeetCode Problem: https://leetcode.com/problems/missing-number/description/

public class MissingNumberCyclicSort {

	public static void main(String[] args) {
		int [] arr = {3, 0, 1};
		
		 System.out.println("Missing number is: " + missingNumber(arr));

	}
	
	public static int missingNumber(int[] arr) {
		
		int i = 0;
		while(i < arr.length) {
			// Check if number is within range and not already in the right place
			
			int correct = arr[i];
			
			if (arr[i] < arr.length && arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}
		
		 // Step 2: Find the missing number means scan the array
		
		for (int index = 0; index < arr.length; index++) {
			if(arr[index] != index) {
				return index;
			}
		}
		
		
		
		
		return arr.length;  // If all numbers are at correct indices, missing number is n
	}
	
	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
