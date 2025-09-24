package arrays;

import java.util.*;

// Problem : Running Sum of 1D Array

public class RunningSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		
		int[] nums = new int[n];
		System.out.println("Enter " + n + " element: ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		System.out.println("Modified Array: " + Arrays.toString(runningSum(nums)));
		
		
		
		sc.close();

	}
	public static int[] runningSum(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			nums[i] = nums[i - 1] + nums[i];
		}
		
		
		return nums;
	}

}
