package Week1;
class Dog {
	void display() {
		System.out.println("teja");
	}
	
}
class Animal extends Dog{
	@Override
	void display() {
		System.out.println("Aswani");
	}
}

public class Qa33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal var1=new Animal();
		var1.display();
	}

}
