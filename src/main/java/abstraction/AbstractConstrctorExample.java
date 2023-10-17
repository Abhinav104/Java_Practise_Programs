package abstraction;

abstract class AbstractConstExample {
	protected String color;

    // Constructor for the abstract class
    public AbstractConstExample(String color) {
        this.color = color;
    }

    // Abstract method to calculate area
    abstract double calculateArea();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Circle extends AbstractConstExample {
    private double radius;

    // Constructor for the Circle class
    public Circle(String color, double radius) {
        super(color); // Call the constructor of the abstract class
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class AbstractConstrctorExample {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        System.out.println("Color: " + circle.color);
        System.out.println("Area: " + circle.calculateArea());
    }
}

