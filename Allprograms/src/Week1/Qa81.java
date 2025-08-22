package Week1;

public class Qa81 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};
        int key = 5;
        boolean found = false;
        for (int i : arr) {
            if (i == key) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
}
