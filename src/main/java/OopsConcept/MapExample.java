package OopsConcept;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("apple", 5);
		map.put("banana", 3);
		map.put("orange", 4);

		System.out.println(map.get("apple")); // Output: 5
		System.out.println(map.containsKey("grape")); // Output: false

	}

}
