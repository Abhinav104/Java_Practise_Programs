package OopsConcept;

interface MyInterface {
    void myMethod();
}

class MyClasss implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("Method implementation in MyClass");
    }
}

public class InterfaceInstantiationExample {
    public static void main(String[] args) {
        MyInterface obj = new MyClasss(); // Creating an object of MyClass that implements MyInterface
        obj.myMethod(); // Calling the method through the interface reference
    }
}
