public class test3 {
    public static void main(String[] args) { // original main method
        System.out.println("in first main()"); // changed output to differentiate
    }

    public static void main(int[] args) { // changed to int[] to avoid duplicate method signature
        System.out.println("a");
    }

    public static void main(char[] args) {//  changed to char[] to avoid duplicate method signature
        System.out.println("a");
    }
}
