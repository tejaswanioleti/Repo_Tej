package Week1;

public class Qa32 {
	void files(int n) {
		System.out.println(n);
	}
	void files(String name) {
		System.out.println(name);
	}
	void files(float s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Qa32 var=new Qa32();
		var.files(10);
		var.files("teja");
		var.files(12.3f);

	}

}
