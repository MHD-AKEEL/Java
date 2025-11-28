// method overriding

class Wappa {

    void car() {
        System.out.println("Red");
    }
}

class Mahan extends Wappa {

    void car() {
        System.out.println("Blue");
    }
}

public class polymorphismEx2 {

    public static void main(String[] args) {
        Mahan m = new Mahan();
        m.car();
    }
}
