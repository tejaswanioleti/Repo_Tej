package Week1;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
public class P_131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	    File s1=new File("C:\\Users\\oleti tejaswani\\OneDrive - presidencyuniversity.in\\Desktop\\assignments\\new1.txt");
	    FileReader s2=new FileReader(s1);
	    Scanner data=new Scanner(s2);
	    if(data.hasNext()) {
	    	String d1=data.nextLine();
	        System.out.println(d1);
	    }

	    
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	    
		
	}

}
