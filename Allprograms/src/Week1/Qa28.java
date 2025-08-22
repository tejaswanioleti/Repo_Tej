package Week1;

//Program to print all prime numbers in a given range
import java.util.Scanner;

public class Qa28 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // Ask user for the range (start and end)
     System.out.print("Enter start of range: ");
     int start = sc.nextInt();

     System.out.print("Enter end of range: ");
     int end = sc.nextInt();

     System.out.println("Prime numbers between " + start + " and " + end + " are:");

     // Loop through each number in the range
     for (int num = start; num <= end; num++) {
         if (isPrime(num)) {
             System.out.print(num + " ");
         }
     }
 }

 // Method to check if a number is prime
 public static boolean isPrime(int n) {
     if (n <= 1)
         return false;

     // Check for factors from 2 to sqrt(n)
     for (int i = 2; i <= Math.sqrt(n); i++) {
         if (n % i == 0)
             return false;
     }
     return true;
 }
}
