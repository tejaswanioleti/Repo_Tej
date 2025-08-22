package Week1;
//program on try-with multiple resources

import java.io.*;

public class Trywith_Multiple_Resources121 {
 public static void main(String[] args) {
     // Multiple resources in single try block
     try (
         FileReader fr = new FileReader("test1.txt");
         BufferedReader br = new BufferedReader(fr)
     ) {
         System.out.println(br.readLine());
     } catch (IOException e) {
         System.out.println("Exception: " + e);
     }
 }
}
