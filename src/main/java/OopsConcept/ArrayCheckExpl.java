package OopsConcept;

public class ArrayCheckExpl {
	
	public static void main(String args[]) {
	
		int arr1[] = null;
		int arr2[]= {};
		int arr3[] = {1,2,3,4};
		
		if(arr1==null) {
			System.out.println("This array is null");
		}
		
		//check for empty for both arrays2 and 3
		
		if(arr2.length == 0) {
			System.out.println("Array is empty");
		}
		
		else {
			System.out.println("Array is not empty");
		}
		
	}
}
