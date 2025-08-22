package Week1;

public class Qa113 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            System.out.println(arr[5]); // This causes ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}

