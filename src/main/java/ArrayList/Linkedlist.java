package ArrayList;

import java.util.LinkedList;

public class Linkedlist {
	
	//Internal structure of LinkedList is doubly LinkedList
	//LinkedList speed is faster then array list
	//Syntax is pretty much same like arraylist
	
	public static void main(String [] args) {
	LinkedList<String> names = new LinkedList<String>();
	names.add("Abhinav");
	names.add("Ruchi");
	names.add("Mohit");
	System.out.println(names);
	
	//Add new value at first
	names.addFirst("Happy");
	
	//Add new valye at last
	names.addLast("Vikas");
	System.out.println(names);
	
	//Remove First and Last element
	
	names.removeFirst();
	names.removeLast();
	
	System.out.println(names);
	
	}

}
