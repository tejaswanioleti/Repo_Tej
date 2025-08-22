package Week1;

public class Qa107 extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        Qa107 thread = new Qa107();
        
        thread.start(); // First time: valid
        try {
            thread.start(); // Second time: throws IllegalThreadStateException
        } catch (IllegalThreadStateException e) {
            System.out.println("Caught Exception: " + e);
        }
    }
}

