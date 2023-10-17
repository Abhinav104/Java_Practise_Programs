package OopsConcept;

public class OverloadExample {
    // Method with two int parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with three int parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }

    // Method with a String parameter
    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadExample example = new OverloadExample();
        System.out.println("Sum of two ints: " + example.add(5, 10));
        System.out.println("Sum of three ints: " + example.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + example.add(3.5, 2.5));
        System.out.println("Concatenation of two strings: " + example.add("Hello, ", "World!"));
    }
}
