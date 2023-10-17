package inhertanceWithConstructor;

public class Vehicle {
	
	//We see how to inherit class when we have constructor in parent and child class
	
	int tyre = 0;
	int gears = 0;
	String cap = "";
	
	public Vehicle(int t, int g, String c) {
		tyre = t;
		gears = g;
		cap = c;
	}
	
	
	public void vehicleInfo() {
		System.out.println("The tyres in a vehicle are " +tyre);
		System.out.println("The gears in a vehicle are "+gears);
		System.out.println("The car has capacity of "+cap);
	}

}
