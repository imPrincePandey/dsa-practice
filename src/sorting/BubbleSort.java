package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {5, 1, 4, 2, 8};

        bubbleSort(arr);

        System.out.println("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

	}
        
        static void bubbleSort(int[] arr) {
            int n = arr.length;
            boolean swapped;

            // Outer loop for passes
            for (int i = 0; i < n - 1; i++) {
                swapped = false;

                // Inner loop for comparing adjacent elements
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }

                // If no elements were swapped, array is sorted
                if (!swapped) break;
            }
        }

}
