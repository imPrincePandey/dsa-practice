package arrays;
import java.util.*;

public class MajorityElementSort {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 2, 3, 2, 2};
        int n = arr.length;

        Arrays.sort(arr);
        int candidate = arr[n / 2]; // possible majority

        // Count how many times candidate appears
        int count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        // Check condition
        if (count > n / 2) {
            System.out.println("Majority Element: " + candidate);
        } else {
            System.out.println("No Majority Element");
        }
    }
}
