// hierarchical inheritance

class sivakumar {

    void house() {
        System.out.println("SivaKumar Veedu");
    }
}

class surya extends sivakumar {

    void test() {
        System.out.println("surya method");
    }
}

class karthi extends sivakumar {

    void run() {
        System.out.println("karthi method");
    }
}

public class hierchicalEx {

    public static void main(String[] args) {
        surya s = new surya();
        karthi k = new karthi();

        s.house();
        k.house();
    }
}
