package StaticMethods;

interface A {
    static void sayHello() {
        System.out.println("Hello!");
    }
}

public class MyClass implements A {
    public static void sayHello() {
        System.out.println("Hello there!");
    }

    public static void main(String[] args) {
        // Call interface's static method
        A.sayHello();          

        // Call class's static method
        MyClass.sayHello();    
    }
}
