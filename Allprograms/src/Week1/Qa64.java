package Week1;

//Program to convert decimal to octal
import java.util.Scanner;

public class Qa64 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter decimal number: ");
     int decimal = sc.nextInt();

     String octal = Integer.toOctalString(decimal);
     System.out.println("Octal equivalent: " + octal);
 }
}
