// Parameterizd
class Demo2 {

    int a;

    Demo2(int x) {
        a = 10;
        System.out.println(x);
    }
}

public class constructor_ex2 {

    public static void main(String[] args) {
        Demo2 d2 = new Demo2(15);
        System.out.println(d2.a);
    }
}
