package Week1;

//Program to find factorial of a number
import java.util.Scanner;

public class Qa48 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a number: ");
     int num = sc.nextInt();

     long fact = 1;
     for (int i = 1; i <= num; i++) {
         fact *= i;
     }

     System.out.println("Factorial of " + num + " is: " + fact);
 }
}
