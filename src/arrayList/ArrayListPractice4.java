package arrayList;
import java.util.*;

public class ArrayListPractice4 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
        names.add("Prince");
        names.add("Ravi");
        names.add("Neha");

        // Normal for loop
        System.out.println("Using normal for loop:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // Enhanced for loop
        System.out.println("Using enhanced for loop:");
        for (String name : names) {
            System.out.println(name);
        }
    

	}

}
