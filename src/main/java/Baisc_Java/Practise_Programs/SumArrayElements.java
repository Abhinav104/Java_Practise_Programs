package Baisc_Java.Practise_Programs;

public class SumArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5,4,5,5,4,2,4,8};
		int sum = 0;
		for(int i=0; i<=a.length-1; i++) {
			
			sum = sum+a[i]; 
		}
		
		System.out.println("The Sum of array is : "+sum);	

	}

}
