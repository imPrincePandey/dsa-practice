package binarySearch;

// "Square Root of x” (LeetCode #69).

public class SqrtX {

	public static void main(String[] args) {
		 int x = 8;
	        System.out.println(mySqrt(x)); // Output: 2

	}
	public static int mySqrt(int x) {
		// check edge case x = 0  return 0. x = 1 return 1


        if (x == 0 || x == 1) {
            return x;
        }

        int low = 1, high = x, ans = 0;

        while (low <= high) {
        	
            int mid = low + (high - low) / 2;

            if ((long) mid * mid == x) {
                return mid; // Perfect square
            } else if ((long) mid * mid < x) {
                ans = mid;     // store possible answer
                low = mid + 1; // search in right half
            } else {
                high = mid - 1; // search in left half
            }
        }

        return ans; // floor value
    }

}
