package Week1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyContent131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		    // File paths
			FileInputStream in = new FileInputStream("C:\\Users\\oleti tejaswani\\OneDrive - presidencyuniversity.in\\Desktop\\assignments\\renamed.txt");
			FileOutputStream out = new FileOutputStream("C:\\Users\\oleti tejaswani\\OneDrive - presidencyuniversity.in\\Desktop\\assignments\\copied.txt");
		    // Read and write data byte by byte
		    int data;
		    while ((data = in.read()) != -1) {
		        out.write(data);
		    }
		    in.close();  // Close input
		    out.close(); // Close output
		    System.out.println("File copied successfully.");
		} catch (IOException e) {
		    e.printStackTrace();
		}

	}

}
