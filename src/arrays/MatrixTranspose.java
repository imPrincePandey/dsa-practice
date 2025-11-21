package arrays;
import java.util.*;

public class MatrixTranspose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();

	        System.out.print("Enter number of columns: ");
	        int cols = sc.nextInt();
	        
	        int[][] matrix = new int[rows][cols];
	        
	        // take user input in matrix
	        
	        System.out.println("Enter elements of the matrix:");
	        for (int i = 0; i < rows; i++) {
	        	for(int j = 0; j < cols; j++) {
	        		System.out.print("Element [" + i + "][" + j + "]: ");
	                matrix[i][j] = sc.nextInt();
	        	}
	        }
	        
	        // Calculate transpose
	        int [][] transpose = new int [cols][rows];
	        
	        for (int i = 0; i < rows; i++) {
	        	for(int j = 0; j < cols; j++) {
	        		transpose[j][i] = matrix[i][j];
	        	}
	        }
	        
	     //  Print original matrix
	        System.out.println("\nOriginal Matrix:");
	        printMatrix(matrix);

	        // Print transpose matrix
	        System.out.println("\nTranspose Matrix:");
	        printMatrix(transpose);
		
		
		sc.close();



	}
	
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
