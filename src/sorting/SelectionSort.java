package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {5, 3, 1, 4, 2};
        selectionSort(arr);
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

	}
	
	public static void selectionSort(int[] arr) {
		int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Assume the minimum is the first unsorted element
            int minIndex = i;

            // Find the actual minimum in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap minimum with the first unsorted element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
	}

}
