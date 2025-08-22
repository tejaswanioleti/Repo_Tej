package Week1;
// This program shows the size of "renamed.txt" in bytes, KB, and MB
import java.io.File;

public class FileSize129 {
    public static void main(String[] args) {
        // Path to the file
        File file = new File("C:\\Users\\oleti tejaswani\\OneDrive - presidencyuniversity.in\\Desktop\\assignments\\renamed.txt");

        // Check if file exists before getting size
        if (file.exists()) {
            long bytes = file.length();         // Size in bytes
            double kb = bytes / 1024.0;         // Convert to KB
            double mb = kb / 1024.0;            // Convert to MB

            System.out.println("File size in Bytes: " + bytes);
            System.out.println("File size in KB: " + kb);
            System.out.println("File size in MB: " + mb);
        } else {
            System.out.println("File not found.");
        }
    }
}

