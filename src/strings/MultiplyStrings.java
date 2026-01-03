package strings;

public class MultiplyStrings {

	public static void main(String[] args) {
		System.out.println(multiply("123", "45"));   
        System.out.println(multiply("99", "99"));

	}
	
	
	public static String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) { // handle the edge case
        return "0";

        }

        int n = num1.length();
        int m = num2.length();

        // create result array

        int[] result = new int[n + m];

        // multiply digit from right to left

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                // here we convert character digit to integer digit

                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';

                int mul = digit1 * digit2;
                int sum = mul + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        // convert Array to string

        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.toString();
        
    }

}
