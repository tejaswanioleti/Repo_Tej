package Week1;

public class Qa111 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Division by zero causes ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}

