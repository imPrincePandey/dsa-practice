package binarySearch;

public class Ceiling {

	public static void main(String[] args) {
		
 // Ceiling is either equal to the target or the smallest value among the elements which are grater then target.
		
		int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 3;

        int result = ceiling(arr, target);
        
            System.out.println("Ceiling Index is: " + result);
        
	}
	public static int ceiling(int[] arr, int target) {
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
        return low; // target not found
    }

}
