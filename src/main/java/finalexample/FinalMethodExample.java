package finalexample;

public class FinalMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Parent parent = new Parent();
        parent.display();
        
        Child child = new Child();
        child.display(); // This calls the parent's final method, not an overridden method (if attempted).
    

	}

}
