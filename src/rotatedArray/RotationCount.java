package rotatedArray;

// Problem : Find the Rotation Count in rotated sorted array

public class RotationCount {

	public static void main(String[] args) {
		int [] nums = {4, 5, 6, 1, 2, 3};
		
		System.out.println("Number of Rotation Count: " +findRotationCount(nums));

	}
	
	/*
	 * Approach : The rotation count = index of the minimum element in the array.
	 * so we find minimum element in the array and then return index
	 */
	
	public static int findRotationCount(int[] nums) {
		int low = 0;  int high = nums.length -1;
		
		while (low < high) {
			int mid = low + (high - low) / 2;
			
			// write the condition of sorted array . keep in mind one half is always sorted
			if (nums[mid] > nums[high]) {
				// If mid element is greater than last, min must be on the right
				low = mid + 1;
			} else {
				high = mid;  // Otherwise, min lies at mid or to the left
			}
		}
		return low; // index of smallest element = rotation count
	}

}
