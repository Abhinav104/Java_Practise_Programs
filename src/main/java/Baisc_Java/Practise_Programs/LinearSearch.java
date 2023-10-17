package Baisc_Java.Practise_Programs;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Linear search is the approach to find particular element in the array by comparing it with other elements
		int a[]= {10,20,40,50,30,50};
		int search_ele = 50;
		
		//iterating loop to all the elements in the array
		boolean flag = false;
		for(int i =0; i<a.length;i++) {
			if(search_ele==a[i]) {
				System.out.println("Element found at index "+i);
				flag=true;	
			}		
		}
		
		if(flag==false) {
			System.out.println("Element not found");
		}

	}

}
