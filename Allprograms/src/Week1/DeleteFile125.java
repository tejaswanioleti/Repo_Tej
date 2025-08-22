package Week1;
//This program deletes the file "sample.txt"
import java.io.File;

public class DeleteFile125 {
 public static void main(String[] args) {
     // File object for the file to delete
     File myFile = new File("example.txt");
     if (myFile.delete()) {
         System.out.println("Deleted the file: " + myFile.getName());
     } else {
         System.out.println("Failed to delete the file.");
     }
 }
}
