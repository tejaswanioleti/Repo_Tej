package Week1;

import java.util.Arrays;
import java.util.Scanner;

public class Qa95 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index to change (0-4): ");
        int index = sc.nextInt();
        System.out.print("Enter new value: ");
        int value = sc.nextInt();
        if(index >= 0 && index < arr.length) {
            arr[index] = value;
        }
        System.out.println("Updated array: " + Arrays.toString(arr));
    }
}
