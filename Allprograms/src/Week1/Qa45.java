package Week1;

//Program to calculate the perimeter of a rectangle
import java.util.Scanner;

public class Qa45 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter length: ");
     double length = sc.nextDouble();
     System.out.print("Enter breadth: ");
     double breadth = sc.nextDouble();

     double perimeter = 2 * (length + breadth);
     System.out.println("Perimeter of rectangle = " + perimeter);
 }
}

