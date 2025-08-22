package Week1;

public class Qa39 {
	int area(int l,int b) {
		return l*b;
		
	}
	int volume(int l,int b, int h) {
		return l*b*h;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Qa39 var=new Qa39();
		System.out.println(var.area(10,20));
		System.out.println(var.volume(10, 20, 30));

	}

}
