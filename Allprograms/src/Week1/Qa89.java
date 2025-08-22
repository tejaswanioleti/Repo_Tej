package Week1;

public class Qa89 {
    public static void main(String[] args) {
        String str = "aabcaabdaab";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String sub = str.substring(i, j);
                if (str.indexOf(sub, j) != -1 && sub.length() > result.length()) {
                    result = sub;
                }
            }
        }
        System.out.println("Longest repeating sequence: " + result);
    }
}