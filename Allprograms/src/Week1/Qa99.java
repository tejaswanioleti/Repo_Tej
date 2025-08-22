package Week1;

public class Qa99 {
    int x;
    Qa99(int x) {
        this.x = x;
    }
    void display() {
        System.out.println("Value: " + this.x);
    }
    public static void main(String[] args) {
        Qa99 obj = new Qa99(10);
        obj.display();
    }
}