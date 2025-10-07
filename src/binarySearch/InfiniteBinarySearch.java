package binarySearch;


  // .............Find position of an element in a sorted array of infinite numbers................
  /*
   * the problem here is that we don’t know the size of the array. 
   * If the array is infinite, we don't have proper bounds to apply binary search.
   * So, Approach will be we search element in small chunks like low for 1st element to high for 2nd element.
   * now compare the target with high index element,
   * if my target element is greater than high then copy the high index in the low index and double the high index.
   * if my target element is smaller than high then apply binary search on high and low index found.
   */

public class InfiniteBinarySearch {

	public static void main(String[] args) {
		int[] nums = {2, 4, 6, 8, 10, 12, 14, 34, 40, 56, 67, 78, 89 };
        int target = 34;
        System.out.println(ans(nums,target));
		

	}
	static int ans(int[] nums, int target) {
		// first find the range 
		// first start with box of size 2
		int low = 0;
		int high = 1;
		
		 // Expand the range exponentially until we find the upper bound
		while (high < nums.length && target > nums[high]) { // we haven’t reached the range yet expand.
			// “Keep expanding the range as long as we’re inside the array and haven’t reached a number greater than or equal to the target.”
			int temp = high + 1; // this is my new start
			// and double the high index value
			// end = previous end + sizeOfBox * 2
			high = high + (high - low + 1) * 2;
			
			// prevent going out of bounds (important in simulation)
            if (high >= nums.length) high = nums.length - 1;
            
			low = temp;
		}
		// Now perform binary search in this range
		
		return binarySearch(nums, low, high, target);
	}
	public static int binarySearch(int[] nums, int low, int high, int target) {
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (target < nums[mid]) {
				high = mid - 1;
			} else if (target > nums[mid]) {
				low = mid + 1;
				
			} else {
				// ans found
				return mid;
			}
		}
		return -1;
		
		
	}

}
