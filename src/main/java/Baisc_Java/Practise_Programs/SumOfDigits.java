package Baisc_Java.Practise_Programs;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234;
		int sum = 0;
		while(num!=0) {
			int rem = num%10;
			sum = sum + rem;
			num = num/10;		
		}
		
		System.out.println("The sum of a number is "+sum);

	}
}
