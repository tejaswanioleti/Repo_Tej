package Week1;

//Parent class
class Parent {
 String message = "Message from Parent class";

 void show() {
     System.out.println("Parent show() method");
 }
}

//Child class named Qa98
class Qa98 extends Parent {
 String message = "Message from Child class";

 void display() {
     // Access parent class variable
     System.out.println(super.message);

     // Call parent class method
     super.show();
 }

 public static void main(String[] args) {
     Qa98 obj = new Qa98();
     obj.display();
 }
}
