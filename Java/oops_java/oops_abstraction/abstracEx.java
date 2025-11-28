// abstraction (data hiding)

abstract class demo {

    abstract void button();
}

// Normal concrete class
class example extends demo {

    void button() {
        System.out.println("Send");
    }
}

public class abstracEx {

    public static void main(String[] args) {
        example e = new example();
        e.button();
    }
}
