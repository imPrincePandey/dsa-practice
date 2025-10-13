package binarySearchIn2D;

// LeetCode Problem: https://leetcode.com/problems/search-a-2d-matrix/description/
// Search in Fully Sorted Matrix

/*
 * Approach: Each row is sorted from left to right AND
 * The first integer of each row is greater than the last integer of the previous row
 * this means the entire matrix is sorted if you flatten it into one array.
 */

public class SearchIn2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] matrix = {
		            {1, 3, 5, 7},
		            {10, 11, 16, 20},
		            {23, 30, 34, 60}
		        };
		        int target = 3;
		        
		        boolean result = searchMatrix(matrix, target);
		        System.out.println("Target found: " + result);

	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		int low = 0;
		int high = rows * cols - 1;
		
		while (low <= high) {
			int mid = low + (high - low) / 2;

            int row = mid / cols; // Converts 1D index to 2D row
            int col = mid % cols; // Converts 1D index to 2D column

            int midValue = matrix[row][col]; // gives the actual element at that position in the 2D matrix.

            
            if (midValue == target) {
            	return true;
            } else if (midValue < target) {
            	low = mid + 1;
            } else {
            	high = mid - 1;
            }
		}
		
		
		
		
		
		
		
		return false;
	}

}
