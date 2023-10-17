package OopsConcept;

class Modifier{
	public String name;
	protected String email;
	private String password;
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String passValue) {
		this.password = passValue;
	}
}

public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifier mod1 = new Modifier();
		mod1.name = "Abhinav";
		mod1.email = "abhinav@gmail.com";
		mod1.setPassword("Test");
		System.out.println(mod1.getPassword());

	}

}
