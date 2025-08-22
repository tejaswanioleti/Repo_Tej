package Week1;
public class Base_child_exception118 {
	public static void main(String []args) {
		try {
		     int[] arr=new int[3];
		     System.out.println(arr[5]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("caught1");
		} catch(Exception e) {
			System.out.println("caught");
		}
	}
}
