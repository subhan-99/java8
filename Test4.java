package features;

@FunctionalInterface
interface Test5 {
    void m1();
}

class Test4 {
    int x = 777;

    public void m2() {
        Test5 i = () -> {
            int x = 888;
            System.out.println(x);       // prints 888 (local variable)
            System.out.println(this.x);  // prints 777 (instance variable of Test4)
        };
        i.m1();
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        t.m2();
    }
}
