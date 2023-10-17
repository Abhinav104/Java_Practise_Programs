package inheritanceMultilevel;

public class Child extends Parent {
	
	String cName = "";
	int cAge = 0;
	
	public Child(String pname, int page,String cname, int cage) {
		super(pname, page);
		cName = cname;
		cAge = cage;
		
	}
	
	public void childInfo() {
		System.out.println("We are in Child class Info section ");
		System.out.println("Child name is "+cName);
		System.out.println("Child age is "+cAge);
	}

}
