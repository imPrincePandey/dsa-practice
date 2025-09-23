package linearSearch;
import java.util.*;

public class SearchInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an arrays: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " element: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// Input range
				System.out.print("Enter start index: ");
		        int start = sc.nextInt();
		        System.out.print("Enter end index: ");
		        int end = sc.nextInt();
		        System.out.print("Enter the target element: ");
		        int target = sc.nextInt();
		
		int range = inRange(arr, start, end, target);
		if (range != -1) {
		    System.out.println("Target found at index: " + range);
		} else {
		    System.out.println("Target not found in the given range.");
		}
		
		
		
		sc.close();


	}
	
	public static int inRange(int[] arr, int start, int end, int target) {
		
		if (arr.length == 0) {
			return -1;
		}
		// Validate indices
        if (start < 0 || end >= arr.length || start > end) {
            return -1;
        }
		
		for (int i = start; i <= end; i++) {
			if (target == arr[i]) {
				return i;
			}
		}
		return -1;
	}

}
