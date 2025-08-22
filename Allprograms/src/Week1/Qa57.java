package Week1;

//Program to demonstrate bit-wise operators
public class Qa57 {
 public static void main(String[] args) {
     int a = 5;  // Binary: 0101
     int b = 3;  // Binary: 0011

     System.out.println("a & b: " + (a & b));  // 1
     System.out.println("a | b: " + (a | b));  // 7
     System.out.println("a ^ b: " + (a ^ b));  // 6
     System.out.println("~a: " + (~a));        // -6 (in 2's complement)
 }
}

