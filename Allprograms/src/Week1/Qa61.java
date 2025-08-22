package Week1;

//Program to find square root of a number using user input
import java.util.Scanner;

public class Qa61 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a number: ");
     double num = sc.nextDouble();

     double sqrt = Math.sqrt(num);
     System.out.println("Square root of " + num + " is: " + sqrt);
 }
}
