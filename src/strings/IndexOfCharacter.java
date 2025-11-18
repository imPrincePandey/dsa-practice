package strings;
import java.util.*;

public class IndexOfCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ask user for input String
		
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		
		// ask user for character to find
		
		System.out.println("Enter the Character: ");
		char ch = sc.next().charAt(0);
		
		// find the index of first occurrence of the character
		
		int index = str.indexOf(ch);
		
		if (index != -1) {
			System.out.println("The index of occurrence is " + index);
		} else {
			System.out.println("Character not found."); // if index is not found return -1
		}
		
		
		
		sc.close();

	}

}
