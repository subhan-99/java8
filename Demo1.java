package features;

public class Demo1 {

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                // Correct code: print "child Thread" 10 times
                for (int i = 0; i < 10; i++) {
                    System.out.println("Child Thread");
                }
            }
        };

        Thread t = new Thread(r);
        t.start();

        // Print "Main Thread" 10 times
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
