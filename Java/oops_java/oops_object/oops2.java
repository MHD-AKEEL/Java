class ajith {
    int x = 30;
    void ak(){
        System.out.println("Racing");
    }

    static void as(){
        System.out.println("This is static");
    }
}

public class oops2 {
    public static void main(String[] args) {
        ajith a = new ajith();
        System.out.println(a.x);
        a.ak();

        ajith.as();
    }
}
