package Week1;

//Program to demonstrate two-level inheritance
class Q1{
	void eat() {
		System.out.println("eating");
		
	}
}
class Q2 extends Q1{
	void sleep() {
		System.out.println("sleeping");
	}
}
class Q3 extends Q2 {
	void run() {
		System.out.println("running");
	}
}
public class Qa41 {
	public static void main(String[] args) {
		Q3 n1=new Q3();
		n1.eat();
		n1.sleep();
		n1.run();
		
	}
}