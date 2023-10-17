package Baisc_Java.Practise_Programs;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int f1=0, f2=1, sum=0;
		
		for(int i=1; i<=10; i++) {
			
			sum = f1 + f2;
			System.out.println(+sum);
			f1=f2;
			f2 = sum; 	
			
		}

	}

}
