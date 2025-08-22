package Week1;

//Program to concatenate two strings
import java.util.Scanner;

public class Qa50 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter first string: ");
     String str1 = sc.nextLine();
     System.out.print("Enter second string: ");
     String str2 = sc.nextLine();

     String result = str1 + str2;  // Concatenation using '+'
     System.out.println("Concatenated String: " + result);
 }
}
