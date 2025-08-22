package Week1;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadTextFile132 {

	public static void main(String[] args) {
		// Try-with-resources automatically closes the file
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\oleti tejaswani\\OneDrive - presidencyuniversity.in\\Desktop\\assignments\\copied.txt"))) {
		    String line;
		    // Read and print each line
		    while ((line = br.readLine()) != null) {
		        System.out.println("Line: " + line);
		    }
		} catch(IOException e) {
		    e.printStackTrace();
		}
	}
}
