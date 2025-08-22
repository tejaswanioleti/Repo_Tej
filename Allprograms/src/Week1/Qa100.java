package Week1;

class Qa100 {
    int x = 10;
    class Inner {
        void display() {
            System.out.println("Value of x: " + x);
        }
    }
    public static void main(String[] args) {
        Qa100.Inner obj = new Qa100().new Inner();
        obj.display();
    }
}