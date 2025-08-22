package Week1;
//program with try-with-resources

import java.io.*;

public class Trywith119 {
 public static void main(String[] args) {
     // try-with-resources will auto-close the resource
     try (BufferedReader br = new BufferedReader(new FileReader("renamed.txt"))) {
         System.out.println(br.readLine());
     } catch (IOException e) {
         System.out.println("IOException: " + e);
     }
 }
}
