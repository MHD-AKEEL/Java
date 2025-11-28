// method overloading

class example {

    void test(int a) {
        System.out.println("Java");
    }

    void test(double b) {
        System.out.println("Python");
    }

    void test(char c) {
        System.out.println("SQL");
    }
}

public class polymorphismEx {

    public static void main(String[] args) {
        example e = new example();

        e.test(5);
        e.test('f');
        e.test(4.7);
    }
}
