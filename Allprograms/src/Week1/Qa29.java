package Week1;
import java.util.Scanner;
public class Qa29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int lines=sc.nextInt();
		int n=1;
		for(int i=1;i<=lines;i++) {  //1=1 2=2 3 3= 3 4 5
			for(int j=1;j<=i;j++) {
				System.out.print(n+" ");
				n++;	
			
			}
			System.out.println();
		}	

	}

}
