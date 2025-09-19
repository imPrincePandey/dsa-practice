package arrayList;
import java.util.ArrayList;

public class ArrayListPractice3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		// Update second element (index 1)
		list.set(2, 300);
		
		System.out.println("Updated List: " + list);
		
		// Remove by index
        list.remove(2); // removes element at index 2 (value 3)
        System.out.println("After removing index 2: " + list);



	}

}
