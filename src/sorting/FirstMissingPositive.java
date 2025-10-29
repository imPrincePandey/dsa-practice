package sorting;

public class FirstMissingPositive {
	public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            // Only place positive numbers within range [1, n]
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        // Find the first missing positive number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }

        // If all are present
        return nums.length + 1;
        
	}
	
	 public static void main(String[] args) {
	        int[] nums = {3, 4, -1, 1};
	        System.out.println("First missing positive: " + firstMissingPositive(nums));
	    }

}
