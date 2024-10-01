package polymorphism;

public class SimpleMath1 {
    int a = 0, b = 0;

    // Constructor to initialize values
    SimpleMath1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Method for addition
    public int add() {
        return a + b;
    }

    // Method for subtraction
    public int sub() {
        return a - b;
    }

    // Method for multiplication
    public int mul() {
        return a * b;
    }

    // Method for division (with zero-check)
    public int div() {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0; // Return 0 or handle it as per your requirement
        }
        return a / b;
    }

    // Main method for testing
    public static void main(String[] args) {
        SimpleMath1 math = new SimpleMath1(10, 2);
        System.out.println("Addition: " + math.add());
        System.out.println("Subtraction: " + math.sub());
        System.out.println("Multiplication: " + math.mul());
        System.out.println("Division: " + math.div());

        // Testing division by zero
        SimpleMath1 mathZero = new SimpleMath1(10, 0);
        System.out.println("Division with zero: " + mathZero.div());
    }
}
