package OopsConcept;

import java.util.ArrayList;
import java.util.List;

public class ArraysNdArrayList {
	
	int[] numbers = new int[5]; // Creates an array of integers with a fixed size of 5
	List<String> names = new ArrayList<>(); // Creates an empty ArrayList for String
	
	ArrayList<Object> mixedList = new ArrayList<>(); //Mixed data types in an ArrayList:
	
	public void initializeArray() {
		numbers[0]=10;
		numbers[1]= 20;
		int thirdNumber = numbers[2]; // Accessing an element
		System.out.println(numbers[1]); 
		System.out.println(thirdNumber);
	}
	
	public void print_array_elements() {
		for(int numberss: numbers) {
			System.out.println(numberss);
		}
	}
	
	public void adding_ele_arraylist() {
		names.add("Abhinav"); //adding elements to an ArrayList of strings
		names.add("Ruchi");
		names.add("Mohit");
		names.add("Happy");
		int size =names.size(); //// Getting the size (number of elements)
		System.out.println("The size of array list is "+size);
		
		names.remove(1); //// Removes the element at index 1
		System.out.println("The size of array list after removing element "+size);
		
		for(String name:names) {
			System.out.println("Names in array list are "+name);
		}
		
		names.add("Bhavesh"); //Dynamic resizing of an ArrayList: Adding another element
		System.out.println("The size of array list after adding bhavesh "+size);
		
		for(String name:names) {
			System.out.println("Names in array list are "+name);
		}
	}
	
	public void mixedArraylist() {
		mixedList.add(42);
		mixedList.add("Abhinav");
		mixedList.add('A');
		mixedList.add(true);
		
		for(Object mixedlists: mixedList) {
			System.out.println(mixedlists);
		}
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArraysNdArrayList ar = new ArraysNdArrayList();
		ar.initializeArray();
		ar.print_array_elements();
		ar.adding_ele_arraylist();
		ar.mixedArraylist();
		
		

	}

}
