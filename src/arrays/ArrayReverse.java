package arrays;
import java.util.*;

public class ArrayReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of an array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " element: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			}
		reverse(arr);  // reverse the array
		System.out.println("Reversed array: " + Arrays.toString(arr));
		
		sc.close();
		

	}
	
	// method for array reverse
	static void reverse(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		while (start < end) {
			swap(arr, start , end);
			start++;
			end--;
		}
	}
	
	// create a method for swap
	static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
