
class facebook {

    int a = 10;

    void frRequest() {
        System.out.println("Mark");
    }

    static void hello() {
        System.out.println("This is static");
    }
}

public class oops {

    public static void main(String[] args) {
        facebook r = new facebook();
        System.out.println(r.a);
        r.frRequest();

        facebook.hello();
    }
}
