package Week1;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Qa136 {
    public static void main(String[] args) {
        // Get current date and time
        LocalDateTime now = LocalDateTime.now();
        
        // Define format pattern
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
        // Format and print
        String formatted = now.format(format);
        System.out.println("Formatted Date and Time: " + formatted);
    }
}
