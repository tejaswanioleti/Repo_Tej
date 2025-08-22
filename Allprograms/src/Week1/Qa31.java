package Week1;
class A{
	void files() {
		System.out.println("files");
	}
}
class B extends A {
	void display() {
		System.out.println("Screen");
	}
}
public class Qa31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B var=new B();
		var.files();
		var.display();

	}

}
