package Week1;

public class Qa110 {
    public static void main(String[] args) {
        Object obj = new String("Hello");

        // Trying to cast a String to Integer (invalid cast)
        try {
            Integer num = (Integer) obj; // This will cause ClassCastException
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}
