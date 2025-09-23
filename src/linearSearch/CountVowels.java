package linearSearch;
import java.util.*;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		int vowelsCount = countVowels(str);
		System.out.println("Total vowels: " + vowelsCount);
		
		sc.close();

	}
	
	public static int countVowels(String str) {
		
		if (str.isEmpty()) {
			return -1;
		}
		
		String vowels = "a,e,i,o,u,A,E,I,O,U";
		int count = 0;
		
		for (char ch : str.toCharArray()) {
			if (vowels.indexOf(ch) != -1) { // check if vowel
				count++;
			}
		}
		return count;
	}

}
