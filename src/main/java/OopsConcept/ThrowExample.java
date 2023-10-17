package OopsConcept;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend =10;
		int divisior = 0;
		
		try {
			
			if(divisior==0) {
				throw new ArithmeticException("Division by 0 is not allowed");
			}
			
			int result = dividend/divisior;
			System.out.println("Result of Division "+result);
		}
		
		catch(ArithmeticException e) {
			System.out.println("Exception Caught "+e.getMessage());
		}

	}

}
