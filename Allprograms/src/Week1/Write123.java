package Week1;
import java.io.FileWriter;
import java.io.IOException;

public class Write123 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Newfile.txt");
            writer.write("Hello, this is a test write to file.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
