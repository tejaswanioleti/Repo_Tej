package Week1;

//Program to demonstrate logical operators
public class Qa53 {
 public static void main(String[] args) {
     int a = 10, b = 20;
     boolean x = true, y = false;

     System.out.println("a < b && x: " + (a < b && x)); // true
     System.out.println("a > b || y: " + (a > b || y)); // false
     System.out.println("!x: " + (!x));                 // false
 }
}

