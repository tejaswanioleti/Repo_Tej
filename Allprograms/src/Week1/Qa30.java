package Week1;
import java.util.Scanner;
public class Qa30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int lines=sc.nextInt();
		String c="*";
		for(int i=1;i<=lines;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}

}
