package finalexample;

class ThisMain {
	
	String name;
	
	//Creating  Constructor with a parameter named 'name'
	
	ThisMain(String name){
		this.name = name;
	}
	
	 void sayHello() {
		System.out.println("Hello, my name is "+this.name);
		
	}

}

public class ThisExample{
	public static void main(String[] args) {
        ThisMain person1 = new ThisMain("Alice");
        ThisMain person2 = new ThisMain("Bob");

        person1.sayHello(); // Outputs: Hello, my name is Alice
        person2.sayHello(); // Outputs: Hello, my name is Bob
	}
}