package features; // correct spelling of 'features'

public interface Interf1 {
    public int squareIt(int n);
}

class Test1 {
    public static void main(String[] args) {
        Interf1 i = n -> n * n;
        System.out.println(i.squareIt(4)); // prints 16
        System.out.println(i.squareIt(5)); // prints 25
    }
}




