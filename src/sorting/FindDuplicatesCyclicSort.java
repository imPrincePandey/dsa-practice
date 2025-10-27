package sorting;

// LeetCode problem: https://leetcode.com/problems/find-the-duplicate-number/

public class FindDuplicatesCyclicSort {

	public static void main(String[] args) {
		
		int [] nums = {4, 3, 2, 2, 1};
		
		System.out.println("Duplicates: " + findDuplicate(nums));
		

	}
	
	
	public static int findDuplicate(int[] nums) {

        int i = 0;
        while(i < nums.length) {
            // write correct place
            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // find duplicate so scan whole array

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return nums[index];
            }
        }

        return -1;
        
    }
    static void swap(int [] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}


