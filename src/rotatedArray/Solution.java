package rotatedArray;



public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,5,6,7,0,1,2};
        int target = 0;

        int result = search(arr, target);
        if (result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found.");

	}
	/*
	 * here we have three possibilities to check
	 * check if target is found
	 * identify which side is sorted left half and right half
	 * decide which half to search next like if target lie between low and mid and vice versa
	 */
	
	public static int search (int[] arr, int target) {
		int low = 0;
		int high = arr.length -1;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (arr[low] <= arr[mid]) {
				if (target >= arr[low] && target < arr[mid] ) { // search in left half
					high = mid - 1;
				} else {
					low = mid + 1; // 				
					}
			}
				// Right half is sorted
				else {
					if (target > arr[mid] && target <= arr[high]) {
						low = mid +1;
					} else {
						high = mid - 1;
				}
				
			}
		}
		
		return -1;
	}

}
