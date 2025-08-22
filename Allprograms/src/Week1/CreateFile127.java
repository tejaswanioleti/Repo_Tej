package Week1;
//This program creates a file named "example.txt" in your assignments folder
import java.io.File;
import java.io.IOException;

public class CreateFile127 {
 public static void main(String[] args) {
     try {
         // Escape backslashes and include full path with filename
         File file = new File("C:\\Users\\oleti tejaswani\\OneDrive - presidencyuniversity.in\\Desktop\\assignments\\example.txt");

         // Try creating the file
         if (file.createNewFile()) {
             System.out.println("File created successfully at: " + file.getAbsolutePath());
         } else {
             System.out.println("File already exists at: " + file.getAbsolutePath());
         }
     } catch (IOException e) {
         System.out.println("An error occurred while creating the file.");
         e.printStackTrace();
     }
 }
}
