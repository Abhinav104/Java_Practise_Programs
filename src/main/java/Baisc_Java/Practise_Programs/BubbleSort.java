package Baisc_Java.Practise_Programs;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {7,3,4,9,2};
		System.out.println("Array before sorting"+ Arrays.toString(a));
		
		int n = a.length;
		
		for(int i=0; i<n-1; i++) 
		{
			for(int j=0;j<n-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]= a[j+1];
					a[j+1]= temp;
				}
			}
		}
		
		System.out.println("Array after sorting"+ Arrays.toString(a));

	}

}
