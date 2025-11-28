
class Demo {

    int a;
    int b;

    Demo() {
        a = 10;
        b = 15;
    }
}

public class constructor_ex {

    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.a);
        System.out.println(d.b);
    }
}
