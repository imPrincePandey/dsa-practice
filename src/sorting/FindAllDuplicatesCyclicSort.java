package sorting;

import java.util.*;

// LeetCode Problem: https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

public class FindAllDuplicatesCyclicSort {

	public static void main(String[] args) {
		int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Duplicates number: " + findDuplicates(nums));

	}
	
	public static  List<Integer> findDuplicates(int[] nums) {

        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // store duplicates element  so we use list here

        List<Integer> result = new ArrayList<>();
        // scan whole array
        for(int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                result.add(nums[index]); // Add duplicates dynamically
            }
        }

        return result;


        
    }

    static void swap(int [] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
