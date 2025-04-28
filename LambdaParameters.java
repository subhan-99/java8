package features;

// Interface
public interface Addable {
    int addition(int a, int b);
}

// Normal implementation
class AddableImpl implements Addable {
    @Override
    public int addition(int a, int b) {
        return a + b;
    }
}

// Main class
public class LambdaParameters {
    public static void main(String[] args) {
        
        // Lambda expression for Addable
        Addable addable = (a, b) -> a + b;
        
        int sum1 = addable.addition(5, 10);
        System.out.println("Sum using Lambda: " + sum1);
        
        // Using AddableImpl class
        AddableImpl impl = new AddableImpl();
        int sum2 = impl.addition(15, 20);
        System.out.println("Sum using AddableImpl class: " + sum2);
    }
}
