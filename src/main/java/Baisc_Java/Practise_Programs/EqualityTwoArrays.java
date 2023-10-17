package Baisc_Java.Practise_Programs;

import java.util.Arrays;

public class EqualityTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[] = {1,2,3,4,5,7};
		int a2[] = {1,2,3,4,5,6};
		
		boolean array_status = Arrays.equals(a1, a2);
		
		if(array_status == true) {
			System.out.println("Arrays are equals");
		}
		
		else {
			System.out.println("Arrays are not equals");
		}

	}

}
