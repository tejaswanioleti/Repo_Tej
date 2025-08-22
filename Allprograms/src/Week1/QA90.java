package Week1;

public class QA90 {
    public static void main(String[] args) {
        String str = " Java Programming Language ";
        str = str.replaceAll("\\s", "");
        System.out.println("After removing spaces: " + str);
    }
}
