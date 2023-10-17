package inheritanceMultilevel;

public class Parent {
	
	String pName = "";
	int pAge=0;
	
	public Parent(String pname, int page) {
		pName = pname;
		pAge = page;
	}
	
	
	public void parentInfo() {
		System.out.println("We are in Parent Info Section");
		System.out.println("Parent name is " +pName);
		System.out.println("Parent age is " +pAge);
	
	}

}
