package arrayList;
import java.util.*;

public class ArrayListPractice2 {

	public static void main(String[] args) {
         
		// Declaration of ArrayList
		ArrayList<String> str = new ArrayList<>();
		
		str.add("Apple");
		str.add("Banana");
		str.add("Orange");
		str.add("Mango");
		
		// Accessing elements
		System.out.println("First Fruit: " + str.get(0));
		System.out.println("Second Fruit: " + str.get(1));
		System.out.println("Third Fruit: " + str.get(2));
		System.out.println("Fourth Fruit: " + str.get(3));


	}

}
