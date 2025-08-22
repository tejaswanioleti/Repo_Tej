package Week1;

public class Qa108 {
    public static void main(String[] args) {
        Object[] objArray = new String[3];
        try {
            objArray[0] = 100; // Causes ArrayStoreException
        } catch (ArrayStoreException e) {
            System.out.println("Incompatible type assignment");
        }
    }
}
