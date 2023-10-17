package Baisc_Java.Practise_Programs;

public class MissingNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To find missing no in an array below conditions should be true:
		// Array should not have duplicates
		// Array no need to be in sorted order
		// Values should be in range
		
		int a[] = {1,2,4,5};
		
		int sum1 = 0;
		
		for(int i=0; i<a.length; i++) {
			
			sum1 = sum1+a[i];
			
		}
		System.out.println("The total sum of array is : "+sum1);
		
		int sum2 =0;
		for(int j=1; j<=5;j++) {
			sum2 = sum2+j;
		}
		System.out.println("The total sum of array range : "+sum2);
		
		int mis_no = sum2-sum1;
		System.out.println("The missing array no is : " +mis_no);
		

	}

}
