package Week1;

import java.util.HashSet;
public class Qa88 {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int maxLen = 0;
        for (int i = 0; i < str.length(); i++) {
            HashSet<Character> set = new HashSet<>();
            int j = i;
            while (j < str.length() && !set.contains(str.charAt(j))) {
                set.add(str.charAt(j));
                j++;
            }
            maxLen = Math.max(maxLen, j - i);
        }
        System.out.println("Longest unique substring length: " + maxLen);
    }
}

