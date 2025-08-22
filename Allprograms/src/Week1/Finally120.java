package Week1;
//9. Write a program to close resources using finally block

import java.io.*;

public class Finally120 {
 public static void main(String[] args) {
     BufferedReader br = null;
     try {
         // Manually opening file
         br = new BufferedReader(new FileReader("renamed.txt"));
         System.out.println(br.readLine());
     } catch (IOException e) {
         System.out.println("IOException: " + e);
     } finally {
         try {
             // Manually closing the file
             if (br != null) br.close();
         } catch (IOException e) {
             System.out.println("Error closing resource");
         }
     }
 }
}

