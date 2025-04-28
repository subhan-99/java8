package features;

// Class should have a name when implementing Runnable
class Test2  implements Runnable {
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) { // removed extra semicolon
            System.out.println("Child Thread");
        }
    }
}


 public class MyRunnable{
    public static void main(String[] args) {
        
    	Test2 r = new Test2(); // create object of MyRunnable
        Thread t = new Thread(r); // pass it to Thread constructor
        t.start(); // start the child thread
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
