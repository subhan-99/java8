package defaultMethods;

interface A {
    default void sayHello() {
        System.out.println("A says Hello");
    }
}

interface B {
    default void sayHello() {
        System.out.println("B says hello");
    }
}

public class MyClass implements A, B {
    @Override
    public void sayHello() {
        B.super.sayHello(); // Choosing A's version explicitly
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.sayHello(); // Corrected instance method call
    }
}
