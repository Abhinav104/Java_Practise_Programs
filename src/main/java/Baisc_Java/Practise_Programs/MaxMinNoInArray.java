package Baisc_Java.Practise_Programs;

public class MaxMinNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For min and max consider first element in array as min and max and then compared to other array elements.
		int a[] = {50,30,40,20,60,70};
		
		//Assume first element as a max number
		int max =a[0];
		
		for(int i=1; i<a.length; i++) {
			
			//To find the min no in array just reverse change the if condition
			if(a[i]<max) {
				max = a[i];
			}
		}
		
		System.out.println("The max no is :"+max);

	}

}
