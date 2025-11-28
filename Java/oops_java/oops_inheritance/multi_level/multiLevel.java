// multi Level Inheritance

class Appa {

    int x = 25;

    void run() {
        System.out.println("Hi");
    }
}

class Wappa extends Appa {

    int y = 35;

    void test() {
        System.out.println("Javaa");
    }
}

class mahan extends Wappa {

    void mahan() {
        System.out.println("Paran Method");
    }
}

public class multiLevel {

    public static void main(String[] args) {
        mahan m = new mahan();
        m.mahan();
        m.run();
        m.test();
    }
}
