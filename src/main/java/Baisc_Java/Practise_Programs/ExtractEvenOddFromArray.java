package Baisc_Java.Practise_Programs;

public class ExtractEvenOddFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5,6};
//		int sum = 0;
		for(int i=0; i<a.length; i++ ) {
			if (a[i]%2 ==0) {
				System.out.println(a[i]+" is a even number");
			}
			
			else {
				System.out.println(a[i]+" is a odd number");
			}
		}
		
//		
//		for(int i=0; i<a.length; i++ ) {
//			if (a[i]%2 !=0) {
//				System.out.println(a[i]+" is a odd number");
//			}
//		}

	}

}
