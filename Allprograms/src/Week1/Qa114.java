package Week1;

public class Qa114 {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println("Division result: " + (10 / 0)); // ArithmeticException
            System.out.println("Array element: " + arr[5]);    // ArrayIndexOutOfBoundsException
        } 
        catch (ArithmeticException e) { // Specific for division errors
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } 
        catch (ArrayIndexOutOfBoundsException e) { // Specific for array errors
            System.out.println("Array Index Out of Bounds: " + e.getMessage());
        } 
        catch (Exception e) { // Parent exception - catches other types
            System.out.println("General Exception: " + e.getMessage());
        }
    }
}

