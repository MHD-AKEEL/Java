public class ex6 {
    public static void main(String[] args) {
        double a,b,c;
        a= 3.0/0; // Infinity
        b= 0.0/4.0; // 0.0
        c= 0.0/0.0; // NaN
        System.out.println(a); // Infinity
        System.out.println(b); // 0.0
        System.out.println(c); // NaN
    }
}
