package Week1;
//This program renames "example.txt" to "renamed.txt" in your assignments folder
import java.io.File;

public class Rename128 {
 public static void main(String[] args) {
     // Specify original and new file names with full path
     File oldFile = new File("C:\\Users\\oleti tejaswani\\OneDrive - presidencyuniversity.in\\Desktop\\assignments\\example.txt");
     File newFile = new File("C:\\Users\\oleti tejaswani\\OneDrive - presidencyuniversity.in\\Desktop\\assignments\\renamed1.txt");

     // Try renaming the file
     if (oldFile.renameTo(newFile)) {
         System.out.println("File renamed to: " + newFile.getName());
     } else {
         System.out.println("Rename failed.");
     }
 }
}
