package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Take input for rows and columns
		System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        
        int[][] arr = new int[rows][cols];
        
		System.out.println(arr.length); // always give number of rows.
		
		// Input for each element 
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print("Element at [" + row + "][" + col + "]: ");
				arr[row][col] = sc.nextInt();
;			}
		}
		
		// Printing using enhanced for loop
		System.out.println("\n2D Array (using Arrays.toString):");
		for (int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
		
		/*
		  Printing whole 2D array at once
	
		
		System.out.println("\n2D Array (using Arrays.deepToString):");
		 System.out.println(Arrays.deepToString(arr));
		 
		 */
		 
		 
		 
		sc.close();
		
		

	}

}
