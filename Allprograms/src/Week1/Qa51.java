package Week1;

//Program to check Armstrong numbers between two integers
import java.util.Scanner;

public class Qa51 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter lower bound: ");
     int low = sc.nextInt();
     System.out.print("Enter upper bound: ");
     int high = sc.nextInt();

     System.out.println("Armstrong numbers between " + low + " and " + high + ":");
     for (int num = low; num <= high; num++) {
         int temp = num, sum = 0, digits = 0;

         int check = temp;
         while (check > 0) {
             digits++;
             check /= 10;
         }

         temp = num;
         while (temp > 0) {
             int digit = temp % 10;
             sum += Math.pow(digit, digits);
             temp /= 10;
         }

         if (sum == num) {
             System.out.print(num + " ");
         }
     }
 }
}
