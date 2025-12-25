public class ex1 {
    public static void main(String[] args) {
        double i = 3.0, j = 3.0, k = 3.0;
        double x = 0.0, y = 2.3;
        
        System.out.println(i<2 || k<2); // false - OR operator
        System.out.println(y>=2 && j<=3); // true - AND operator
        System.out.println(! (3>j)); // true - NOT operator

        System.out.println(x<=4 || y>=1); // true - OR operator
        System.out.println(x>2 && y>=3); // false - AND operator
        System.out.println(!(i>4)); // false - NOT operator

        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = (a^b);
        boolean f = (b&a) | (c&d);

        System.out.println("a = " + a); // true
        System.out.println("b = " + b); // false
        System.out.println("c = " + c); // true
        System.out.println("d = " + d); // false
        System.out.println("e = " + e); // true
        System.out.println("f = " + f); // false
    }
}