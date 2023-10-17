package OopsConcept;

import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("orange");
		set.add("apple"); // Duplicate element, not added
		
		System.out.println(set); // Output: [banana, orange, apple]

	}

}
