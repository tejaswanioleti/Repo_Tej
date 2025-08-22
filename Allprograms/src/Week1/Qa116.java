package Week1;

public class Qa116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x=3/0;
			String name=null;
		} catch(ArithmeticException e) {
			System.out.println(e);
		} catch(NullPointerException e) {
			System.out.println(e);
		}

	}

}
