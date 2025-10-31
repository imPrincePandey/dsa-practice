package strings;

public class ReverseStringManual {

	public static void main(String[] args) {
		String input = "Prince";
        String reversed = reverseString(input);
        
        System.out.println("Input   : " + input); 
        System.out.println("Reversed: " + reversed); 

	}
	
	public static String reverseString(String s) {
		
		if (s == null) {
			return null;
		}
		int n = s.length();
		
		// change String into char
		char[] arr = s.toCharArray();
		
		int i = 0; 
		int j = n -1;
		while(i < j) {
			// swap arr[i] and arr[j]
			
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		// build result String (char to String)
		
		return new String(arr);
		
	}

}
