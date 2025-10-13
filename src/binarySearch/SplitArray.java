package binarySearch;

import java.util.Arrays;

// LeetCode problem: https://leetcode.com/problems/split-array-largest-sum/description/

public class SplitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {7, 2, 5, 10, 8};
		int k = 2;
		
		int result = splitArray(nums , k);
		System.out.println("Answer: " + result);

	}
	
	/*
	 * Given an array nums and an integer k,
       split nums into exactly k contiguous subarrays,
       so that the largest subarray sum among them is as small as possible.

       Then, return that minimized largest sum
	 */
	public static int splitArray(int[] nums, int k) {
	    int low = Arrays.stream(nums).max().getAsInt();
	    int high = Arrays.stream(nums).sum();

	    while (low < high) {
	        int mid = low + (high - low) / 2;

	        if (canSplit(nums, k, mid)) {
	            // possible to split, try smaller sum
	            high = mid;
	        } else {
	            // too small, need larger sum
	            low = mid + 1;
	        }
	    }

	    return low; // minimized largest sum
	}

	public static boolean  canSplit(int[] nums, int k, int maxAllowed) {
	    int currentSum = 0, count = 1;

	    for (int n : nums) {
	        if (currentSum + n > maxAllowed) {
	            count++; // start new subarray
	            currentSum = n;
	            if (count > k) return false;
	        } else {
	            currentSum += n;
	        }
	    }
	    return true;
	}


}
