package linearSearch;
import java.util.*;

// problem: Find numbers with even number of digit

public class FindEvenNoInDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an arrays: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter " + n + " element: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Number of even number in digit: " + findNumber(arr));
		
		sc.close();

	}
	public static int findNumber(int[] arr) {
		// iterate over digit
		int count = 0;
		
		for (int num : arr) {
			if (even(num)) {
				count++;
			}
		}
		
		return count;
	}
	public static boolean even(int num) {
		int numberOfDigit = digits(num);
		return numberOfDigit % 2 == 0;
	}
	
	// count number of digit in a number
	public static int digits(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
				
				return count;
	}

}
