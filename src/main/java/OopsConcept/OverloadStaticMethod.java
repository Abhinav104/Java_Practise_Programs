package OopsConcept;

class MathOperations {
    // Static method to add two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Overloaded static method to add two doubles
    static double add(double a, double b) {
        return a + b;
    }

    // Overloaded static method to add three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class OverloadStaticMethod {
    public static void main(String[] args) {
        int sum1 = MathOperations.add(5, 3);             // Calls the first add method
        double sum2 = MathOperations.add(4.2, 2.8);     // Calls the second add method
        int sum3 = MathOperations.add(10, 20, 30);      // Calls the third add method

        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
        System.out.println("Sum 3: " + sum3);
    }
}
