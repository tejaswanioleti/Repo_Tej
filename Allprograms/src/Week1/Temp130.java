package Week1;
//This program creates a temporary file in your assignments folder so you can find it easily
import java.io.File;
import java.io.IOException;

public class Temp130 {
 public static void main(String[] args) {
     try {
         // Define the directory where you want the temp file
         File dir = new File("C:\\Users\\oleti tejaswani\\OneDrive - presidencyuniversity.in\\Desktop\\assignments");

         // Create a temp file in that directory with prefix and suffix
         File temp = File.createTempFile("tempfile_", ".tmp", dir);

         System.out.println("Temporary file created at: " + temp.getAbsolutePath());
     } catch (IOException e) {
         System.out.println("Failed to create temporary file.");
         e.printStackTrace();
     }
 }
}

