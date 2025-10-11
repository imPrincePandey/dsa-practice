package rotatedArray;

// LeetCode problem: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/

public class SearchInDuplicate {

	public static void main(String[] args) {
         int[] nums = {2, 2, 2, 1, 1, 2, 2};
         int target = 1;
        

        boolean result = search(nums,target);
        System.out.println(result);

	}
	/*
	 * In the distinct version, one side (left or right) is always strictly sorted.
       That’s what helps us decide which half to search.
       But with duplicates, you can have cases like: [2, 2, 2, 3, 2, 2]
       nums[mid], nums[low], and nums[high] might be equal — which breaks the sorted side detection.
	 */
	
	/*
	 * Approach will be : When all three are equal (nums[low] == nums[mid] == nums[high])
	 * we shrink the window by moving both ends inward
	 */
	
	public static boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return true;
            }
            // Handle duplicates
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                // shrink the both end inside
                low++;
                high--;
                continue;

            }
            // Left half is sorted
            if (nums[low] <= nums[mid]) {
                // search the target in between low and mid
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
                // Right half is sorted
            } else {
                // search target in between mid and high
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
        
    }
}
	


