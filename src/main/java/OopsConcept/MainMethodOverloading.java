package OopsConcept;

public class MainMethodOverloading {
    public static void main(String[] args) {
        System.out.println("Standard main method");
        
        //running second no main method
        main(42);
        
        //running 3rd main method
        main("Hello","World");
    }

    public static void main(int x) {
        System.out.println("Overloaded main method with int parameter: " + x);
    }

    public static void main(String arg1, String arg2) {
        System.out.println("Overloaded main method with two String parameters: " + arg1 + ", " + arg2);
    }
}
