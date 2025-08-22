package Week1;

public class Qa80 {
    static int staticVar = 10;
    int nonStaticVar = 20;

    static void staticMethod() {
        System.out.println("Static Method: " + staticVar);
    }

    void nonStaticMethod() {
        System.out.println("Non-Static Method: " + nonStaticVar);
    }

    public static void main(String[] args) {
        staticMethod();
        Qa80 obj = new Qa80();
        obj.nonStaticMethod();
    }
}