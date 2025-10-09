package rotatedArray;

// LeetCode Problem: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

public class FindMinimum {

	public static void main(String[] args) {
		int[] arr = {4,5,6,7,0,1,2};
        

        int result = findMin(arr);
        System.out.println("Minimum Element: " + result);



	}
	
	public static int findMin(int[] arr) {
		// hint : nums[mid] > nums[high] -> 7 > 2
		// means the rotation (and hence minimum) is to the right.
		int low = 0;
		int high = arr.length - 1;
		
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] > arr[high]) {
				low = mid + 1; // Minimum is in right half
			} else {
				high = mid; // Minimum is in left half (including mid)
			}
		}
		return arr[low]; // Loop stop here because at the end high become mid
	}

}
