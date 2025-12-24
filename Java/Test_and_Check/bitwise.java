public class bitwise {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;
        int num3, num4, num5;

        num3= 7 & 2; // bitwise AND
        System.out.println(num3); // output: 2

        num4 = 7 | 2; // bitwise OR
        System.out.println(num4); // output: 7

        num5 = 7 ^ 2; // bitwise XOR
        System.out.println(num5); // output: 5

        int x=3, y=2, z=7;
        System.out.println("x<<2=" + (x<<2)); // left shift output: 12

        System.out.println("z>>1=" + (z>>1)); // right shift output: 3
    }
}
