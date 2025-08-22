package Week1;

//Program to convert binary to octal
import java.util.Scanner;

public class Qa62 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter binary number: ");
     String binary = sc.nextLine();

     int decimal = Integer.parseInt(binary, 2);
     String octal = Integer.toOctalString(decimal);

     System.out.println("Octal equivalent: " + octal);
 }
}
