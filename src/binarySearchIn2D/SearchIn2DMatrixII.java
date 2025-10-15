package binarySearchIn2D;

// LeetCode Problem: https://leetcode.com/problems/search-a-2d-matrix-ii/description/

/*
 * Problem Statement: Row and Column Sorted Matrix
 * where, Each row is sorted left -> right, Each column is sorted top -> bottom
 * But, NOT globally sorted (i.e. not “flattenable” into a sorted 1D array).
 */

public class SearchIn2DMatrixII {

	public static void main(String[] args) {
		int[][] matrix = {
	            {1, 4, 7, 11, 15},
	            {2, 5, 8, 12, 19},
	            {3, 6, 9, 16, 22},
	            {10,13,14,17,24},
	            {18,21,23,26,30}
	        }; 
		int target = 5;
		boolean result = searchInMatrix(matrix, target);
        System.out.println("Target found: " + result);

	}
	
	/*
	 * Approach: the top-right corner
	 * where, Everything left of x(top-right corner element) is smaller and Everything below x is larger
	 * so three condition required: If x == target -> found
	 * If x > target -> move left (decrease column)
	 * If x < target -> move down (increase row)
	 */
	
	public static boolean searchInMatrix(int[][] matrix, int target) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		int row = 0; // start from top row
		int col = cols - 1; //  start from last column
		
		while (row < rows && col >= 0) {
			int value = matrix[row][col];
			
			if (value == target) {
				return true;
			} else if (value > target) {
				col--; // move left
			} else {
				//move down
				row++;
			}
			
		}
		
		
		
		return false; // not found
	}

}
