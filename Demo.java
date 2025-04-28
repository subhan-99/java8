package features;

// Define a functional interface
@FunctionalInterface
interface Test {
    void fun();
    
    
}

interface T2{
	 void m2 (int a, int b);
}




public class Demo {
    public static void main(String[] args) {
        Test t = () -> System.out.println("fun method");
        t.fun(); // calling the method
        
        T2 t2=(a, b)->
        {
        	System.out.println(a+b);
        	
        };
        t2.m2(100,200);
    }
}
