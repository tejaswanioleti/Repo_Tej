package Week1;

public class Onlybase_exception117 {
	public static void main(String []args) {
		try {
			int[] arr=new int[3];
			System.out.println(arr[5]);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}