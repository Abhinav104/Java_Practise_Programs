package finalexample;

public class FinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int result = divide(10,0);
			System.out.println("Result:" +result);
		}
		
		catch(ArithmeticException e ) {
			System.out.println("Exception "+e.getMessage());
			
		}
		
		finally {
			System.out.println("clean up and resource release here");
		}

	}

	private static int divide(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

}
