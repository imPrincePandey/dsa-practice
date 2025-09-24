package linearSearch;
import java.util.*;

// problem statement: Richest customer wealth

public class MaxWealth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Take input for rows and columns
				System.out.print("Enter number of rows (customers): ");
		        int rows = sc.nextInt();

		        System.out.print("Enter number of columns (accounts per customer): ");
		        int cols = sc.nextInt();
		        
		        int[][] accounts = new int[rows][cols];
		        
				
				
				// Input for each element 
		        System.out.println("Enter wealth values for each account:");
				for (int row = 0; row < accounts.length; row++) {
					for (int col = 0; col < accounts[row].length; col++) {
						
						accounts[row][col] = sc.nextInt();
					}
				}
				System.out.println("Maximum Wealth: " + maximumWealth(accounts));
				
				sc.close();

	}
	public static int maximumWealth(int[][] accounts) {
		int maxWealth = Integer.MIN_VALUE;
		for (int row = 0; row < accounts.length; row++) {
			// when you start a new column take a sum of that row
			int sum = 0;
			for (int col = 0; col < accounts[row].length; col++) {
				sum += accounts[row][col];
			}
			// now we have sum of account of person
			// check with overall answer
			if (sum > maxWealth) {
				maxWealth = sum;
			}
		}
		return maxWealth;
		
	}

}
