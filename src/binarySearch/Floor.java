package binarySearch;

public class Floor {
	/*
	 * Floor : refers to the largest element in the array that is less than or equal to a given target value x
	 * Example: Given a sorted array arr = [3, 4, 7, 8, 10] and a target x = 5:
       The floor of x would be 4.
	 */

	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 5;

        int result = floor(arr, target);
        
            System.out.println("Floor Index is: " + result);
        
	}
	public static int floor(int[] arr, int target) {
		// what if the target is grater then the largest number in the array exist so,
		if (target > arr[arr.length - 1]) {
			return -1;
		}
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // target found
            } else if (arr[mid] < target) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }
        return high; // target not found

	}

}
