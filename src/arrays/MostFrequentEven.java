package arrays;

public class MostFrequentEven {

	public static void main(String[] args) {
		int [] nums = {2,2,4,4,4,6};
		int result = mostFrequentEven(nums);
		
		System.out.println("Most frequent even number is: " + result);

	}
	
	public static int mostFrequentEven(int[] nums) {
		int MAX = 100000;
		int[] freq = new int[MAX + 1];
		
		int answer = -1;
		int maxFreq = 0;
		
		// check even number
		
		for (int num : nums) {
			if (num % 2 == 0) {
				int newFreq = ++freq[num]; // increment first then return value
				
				// update answer
				if (newFreq > maxFreq || newFreq == maxFreq && num < answer) {
					maxFreq = newFreq;
					answer = num;
				}
			}
		}
		
		
		
		return answer;
	}

}
