package arrayList;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		// Basic ArrayList Methods
		
		ArrayList<String> list = new ArrayList<>();
		
		// add some item
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		
		list.add(1, "Mango");
		
		System.out.println(list);
		// getting element
		String fruit = list.get(0);
		System.out.println("Fruit at index 0: " + fruit);
		
		// updating element
		list.set(2, "Grapes");
		
		System.out.println("Updated List: " + list);
		
		// checking size
		System.out.println("Size: " + list.size());
		
		
		// check element exist
		
		
		 // Check if "Mango" is present in the fruitList
		boolean containMango = list.contains("Mango");
		System.out.println("Fruit list contains Mango: " + containMango);
		boolean containCheri = list.contains("Cheri");
		System.out.println("Fruit list contains Cheri: " + containCheri);



	}

}
