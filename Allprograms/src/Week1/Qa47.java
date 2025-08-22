package Week1;

//Program to calculate compound interest
import java.util.Scanner;

public class Qa47 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter principal: ");
     double principal = sc.nextDouble();
     System.out.print("Enter rate of interest: ");
     double rate = sc.nextDouble();
     System.out.print("Enter time in years: ");
     double time = sc.nextDouble();

     double amount = principal * Math.pow((1 + rate / 100), time);
     double ci = amount - principal;

     System.out.println("Compound Interest = " + ci);
 }
}

