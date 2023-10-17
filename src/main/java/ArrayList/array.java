package ArrayList;

import java.util.ArrayList;

public class array {
	
	public static void main(String [] args) {
	
	ArrayList<String> color = new ArrayList<String>();
	
	color.add("Yellow");
	color.add("Black");
	color.add("Green");
	System.out.println(color);
	
	//Some array list operations
	// Get particular element
	color.get(1);
	
	//change element value
	color.set(1, "Blue");
	
	//Remove element
	color.remove(0);
	
	}
}
