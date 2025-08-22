package Week1;
class CustomException extends Exception {
    CustomException(String msg) {
        super(msg);
    }
}

public class Qa109 {
    public static void main(String[] args) {
        try {
            throw new CustomException("This is a custom exception");
        } catch (CustomException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
