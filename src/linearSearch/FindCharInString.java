package linearSearch;
import java.util.*;

public class FindCharInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter the target element: ");
		char target = sc.next().charAt(0);
		
		
		int index = search(name, target);
		if (index != -1) {
		    System.out.println("Character found at index: " + index);
		} else {
		    System.out.println("Character not found.");
		}
		
		
		
		
		sc.close();

	}
	public static int search(String str, char target) {
		// edge case
		if (str.length() == 0) { // or you can also write str.isEmpty().....
			return -1;
		}
		
		// Think about case sensitivity
		// want 'A' and 'a' to be the same
		str = str.toLowerCase();
		target = Character.toLowerCase(target); 
		
		for (int i = 0; i < str.length(); i++) {
			if (target == str.charAt(i)) {
				return i; // index found
			}
		}
		return -1; // not found
		
	}

}
