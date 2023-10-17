package interfacee;

public interface Phone {
	
	//Interface has all abstract methods
	//We cannot instantiate interface means object cannot be created for interface
	// Interface can be used by using Implement keyword instead of extends.
	// All fields in interfaces are public, static and final by default.
	// All methods are public and abstract by default, no need to write keyword public in method name.
	// Class that implement interface must implement all the methods declared in the interface.
	
	public void phoneColor();
	
	public void batteryMAH();
	
	public void cameraValue();
	
	

}
