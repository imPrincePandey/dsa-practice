package rotatedArray;

public class DuplicatesHandling {

	public static void main(String[] args) {
          int[] arr = {2, 2, 2, 1, 1, 2, 2};
        

        int result = findMin(arr);
        System.out.println("Minimum Element: " + result);

	}
	
	public static int findMin(int[] arr) {
		int low = 0;
		int high = arr.length-1;
		
		while (low < high) {
			int mid = low + (high - low) / 2;
			
			if (arr[mid] > arr[high]) {
				low = mid + 1; // Minimum lies in right half
			} else if (arr[mid] < arr[high]) {
				high = mid; // Minimum lies in left half (including mid)
			} else {
				 // arr[mid] == arr[high]
                // Can't decide, so shrink the search space safely
                high = high - 1;
			}
		}
		
		
		return arr[low]; 
		// if index required then simple return low or high;
		//return low;
	}
	
	/*
	 * For future purpose hint: 
	 * why high = high - 1 works?
	 * When arr[mid] == arr[high], you can’t tell which side is unsorted.
	 * But you know for sure that arr[high] is not smaller than arr[mid].
	 * So, by reducing high, you don’t lose the minimum, you just shrink the range.
	 */

}
