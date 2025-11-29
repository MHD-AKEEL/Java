// interface

interface Atm {

    void amount();
}

interface Netbank {

    void sendamount();
}

class Atmipm implements Atm, Netbank {

    public void amount() {
        System.out.println("5000");
    }

    public void sendamount() {
        System.out.println("4500");
    }
}

public class bank {

    public static void main(String[] args) {
        Atmipm a = new Atmipm();
        a.amount();
        a.sendamount();
    }
}
