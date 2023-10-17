package OopsConcept;

//In this example, the changeValue method takes an int parameter, 
//but modifying x inside the method does not affect the original variable num. This demonstrates call by value.
public class CallByValue {

	public void changeValue(int x) {
		
		x=20;
		System.out.println("Inside changevalue method  "+x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		System.out.println("Before calling changeValue method num is "+num);
		CallByValue cbv = new CallByValue();
		cbv.changeValue(num);
		System.out.println("After calling changeValue method num is "+num);

	}

}
