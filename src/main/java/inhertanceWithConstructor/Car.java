package inhertanceWithConstructor;

public class Car extends Vehicle {
	
	int engineNo=0;
	int chasisNo=0;
	String model="";
	
	public Car(int t, int g, String c, int eng, int ch, String m) {
		super(t,g,c);
		engineNo = eng;
		chasisNo = ch;
		model = m;
	}
	
	public void fordCar() {
		System.out.println("Engine no "+engineNo);
		System.out.println("Chasis no "+chasisNo);
		System.out.println("Vehicle model "+model);
	}
	
	

}
