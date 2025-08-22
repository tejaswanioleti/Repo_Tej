package Week1;

public class Qa43 {

	public static void main(String[] args) {
		int a = 12, b = 18;
        int hcf = 1;

        for (int i = 1; i <= a || i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF of " + a + " and " + b + " is: " + hcf);
		// TODO Auto-generated method stub

	}

}
