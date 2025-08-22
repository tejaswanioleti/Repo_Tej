package Week1;
//This program compares the paths of two files to check if they are the same
import java.io.File;

public class ComparePath126 {
 public static void main(String[] args) {
     // Two file objects
     File file1 = new File("test1.txt");
     File file2 = new File("test2.txt");

     // Compare absolute paths
     if (file1.getAbsolutePath().equals(file2.getAbsolutePath())) {
         System.out.println("Paths are the same.");
     } else {
         System.out.println("Paths are different.");
     }
 }
}
