package OopsConcept;


class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}


public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dg = new Dog();
		dg.makeSound();

	}

}
