package linearSearch;
import java.util.*;

public class FindTarget {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of an array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " element: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			}
		System.out.print("Enter the target Element: ");
		int target = sc.nextInt();
		
		int result = targetElement(arr, target);
		System.out.println("Target index: " + result);
		
		
		sc.close();

	}
	// search in the array return if item found
	// otherwise if item not found return -1
	static int targetElement(int[] arr, int target) {
		// Edge cases
		if (arr == null || arr.length == 0) {
			return -1;
		}
		
		// run for loop
		
		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];
			if (element == target) {
				return i;
			}
		}
		// if the element is not found in the array then return -1
		return -1;
		
	}

}
