package Week1;

public class Qa115 {
    public static void riskyMethod(int option) {
        if (option == 1) {
            throw new ArithmeticException("Division by zero error!");
        } else if (option == 2) {
            throw new NullPointerException("Null value found!");
        } else {
            System.out.println("No exception thrown.");
        }
    }

    public static void main(String[] args) {
        try {
            riskyMethod(2); // Change 1, 2, or 3 to test
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
