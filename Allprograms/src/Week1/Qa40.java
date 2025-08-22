package Week1;
//Program to demonstrate constructor in Java
class Qa40 {
 String name;
 int age;

 // Constructor
 Qa40(String studentName, int studentAge) {
     name = studentName;
     age = studentAge;
 }

 void displayInfo() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }

 public static void main(String[] args) {
     Qa40 s1 = new Qa40("Teja", 21);
     s1.displayInfo();
 }
}
