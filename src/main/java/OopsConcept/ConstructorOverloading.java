package OopsConcept;

public class ConstructorOverloading { //you can ceate class with Person name
    private String name;
    private int age;

    // Constructor with no parameters (default values)
    public ConstructorOverloading() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor with name parameter
    public ConstructorOverloading(String name) {
        this.name = name;
        this.age = 0; // Default age
    }

    // Constructor with name and age parameters
    public ConstructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public static void main(String[] args) {
    	ConstructorOverloading person1 = new ConstructorOverloading(); // Using default constructor
    	ConstructorOverloading person2 = new ConstructorOverloading("Alice"); // Providing a name
    	ConstructorOverloading person3 = new ConstructorOverloading("Bob", 30); // Providing a name and age

        System.out.println(person1.getName() + ", " + person1.getAge()); // Unknown, 0
        System.out.println(person2.getName() + ", " + person2.getAge()); // Alice, 0
        System.out.println(person3.getName() + ", " + person3.getAge()); // Bob, 30
    }
}
