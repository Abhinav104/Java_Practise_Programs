package inheritanceMultilevel;

public class GrandChild extends Child {
	
	
	String gcName ="";
	int gcAge =0;
	
	public GrandChild(String pname, int page, String cname, int cage, String gcname, int gcage) {
		super(pname,page,cname,cage);
		gcName = gcname;
		gcAge = gcage;
	}
	
	public void grandChildInfo() {
		System.out.println("We are in Grand Child class Info section ");
		System.out.println("Grand Child name is "+gcName);
		System.out.println("Grand Child age is "+gcAge);
	}

}
