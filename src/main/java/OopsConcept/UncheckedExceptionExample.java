package OopsConcept;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int result = numbers[5]; // This will throw an ArrayIndexOutOfBoundsException at runtime
        System.out.println("Result: " + result); // This line will not be executed
    }
}

