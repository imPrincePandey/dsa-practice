package arrays;

public class MaximumProductSubarray {

    public static int maxProduct(int[] nums) {
        // Initialize with the first element
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            // If current is negative, swap max and min
            if (current < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            // Update maxSoFar and minSoFar
            maxSoFar = Math.max(current, maxSoFar * current);
            minSoFar = Math.min(current, minSoFar * current);

            // Update result
            result = Math.max(result, maxSoFar);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println("Maximum product subarray is: " + maxProduct(nums));

        int[] nums2 = {-2, 0, -1};
        System.out.println("Maximum product subarray is: " + maxProduct(nums2));
    }
}

