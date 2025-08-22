package Week1;

import java.util.HashSet;
public class Qa85 {
    public static void main(String[] args) {
        String str = "programming";
        HashSet<Character> set = new HashSet<>();
        System.out.print("Duplicate characters: ");
        for (char c : str.toCharArray()) {
            if (!set.add(c)) {
                System.out.print(c + " ");
            }
        }
    }
}