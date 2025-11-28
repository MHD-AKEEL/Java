// Single level inheritance (one parent & one child)

class A {

    int a = 20;

    void test() {
        System.out.println("Hello");
    }
}

class B extends A {

    int b = 10;

    void run() {
        System.out.println("Java");
    }
}

public class singleLevel {

    public static void main(String[] args) {
        B ref = new B();

        ref.run();
        ref.test();
    }
}
