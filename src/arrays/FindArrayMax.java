package arrays;
import java.util.*;

public class FindArrayMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Size of an Array: ");
		int n = sc.nextInt()
;
		int [] arr = new int[n];
		System.out.println("Enter " + n + " elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		// Print result
		int maximum = findMax(arr);
		System.out.println("Maximum element is: " + maximum);
		
		sc.close();
		
		
	}
	
	// Method to find maximum element in array
	static int findMax(int[] arr) {
		// assume arr is not empty
		int maxValue = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
			
			
		}
		return maxValue;
	}

}
