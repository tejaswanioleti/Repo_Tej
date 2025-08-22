package Week1;
//This program reads content from "sample.txt" and prints it
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Read124 {
 public static void main(String[] args) {
     try {
         // Create file object to read from
         File myFile = new File("renamed.txt");

         // Scanner to read file content
         Scanner reader = new Scanner(myFile);
         while (reader.hasNextLine()) {
             String data = reader.nextLine();
             System.out.println("Reading: " + data);
         }
         reader.close(); // Close reader
     } catch (FileNotFoundException e) {
         System.out.println("File not found.");
         e.printStackTrace();
     }
 }
}

