package Baisc_Java.Practise_Programs;

public class EvenOddDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234;
		int even_counter = 0;
		int odd_counter = 0;
		
		while(num>0) {
			int rem = num%10;
			
			if(rem%2==0) {
				even_counter++;
			}
			
			else {
				odd_counter++;
			}
			
			num = num/10;
		}
		
		System.out.println("Even Number are : "+even_counter);
		System.out.println("Odd Number are : "+odd_counter);
	}

}
