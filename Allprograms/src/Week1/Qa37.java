package Week1;
import java.util.Scanner;
public class Qa37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int f=sc.nextInt();
		int s=sc.nextInt();
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			int next=f+s;
			System.out.println(next);
			f=s;
			s=next;
		}
		

	}

}
