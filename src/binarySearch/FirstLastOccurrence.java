package binarySearch;
// problem statement: Find First and Last Position of Element in Sorted Array problem
import java.util.*;

public class FirstLastOccurrence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		
		int[] nums = new int[n];
		
		System.out.println("Enter " + n + " element: ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		System.out.println("Enter the Target: ");
		int target = sc.nextInt();
		
		System.out.println("First occurrence: " + firstOccurrence(nums, target));
        System.out.println("Last occurrence: " + lastOccurrence(nums, target));
		
		
		
		
		
		sc.close();
		

	}
	
	// method for finding first occurrence
	public static int firstOccurrence(int[] nums, int target) {
		int low = 0;
		int high = nums.length-1;
		int ans = -1;
		
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] == target) {
			ans = mid;  // record answer
			high = mid - 1; // go left for earlier occurrence
			
			} else if (nums[mid] < target) { // search for right
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return ans;
		
	}
	
	// method for finding last occurrence
	public static int lastOccurrence(int[] nums, int target) {
		int ans = -1;
		int low = 0;
		int high = nums.length-1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			
			if (nums[mid] == target) {
				ans = mid;  // possible last occurrence
				low = mid + 1;  // go right for later occurrence
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		
		
		
		
		
		
		return ans;
		
	}

}
