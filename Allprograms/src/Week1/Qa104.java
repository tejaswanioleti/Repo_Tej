package Week1;

public class Qa104 {
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Underage");
        } else {
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String[] args) {
        checkAge(20);
    }
}
