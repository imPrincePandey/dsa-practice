package binarySearch;
import java.util.*;

// Problem statement: Single Element in sorted array. (Leetcode 540)

public class SingleNonDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		
		int[] nums = new int[n];
		
		System.out.println("Enter " + n + " element: ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println("OutPut: " + singleNonDuplicate(nums));
		
		sc.close();

	}
	public static int singleNonDuplicate(int[] nums) {
		int low = 0;
		int high = nums.length-1;
		
		while (low < high) { // here we looking for index
			int mid = low + (high - low) / 2;
			// check for even mid
			if (mid % 2 == 1) mid--;
			
			// then check compare mid index and next
			if (nums[mid] == nums[mid + 1]) {
				low = mid + 2; // single element is in right half
			} else {
				high = mid; // single element is in left half (including mid)
			}
		}
		
		
		
		return nums[low];
	}

}
