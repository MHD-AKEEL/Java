public class ex4 {
    public static void main(String[] args) {
       float value1 = 2.0f;
       int num1 = 10;
       String str = "100";
       char ch = 'B';

         System.out.println(str + ch); // String concatenation
         System.out.println(ch + value1); // char to int (66) + float
         System.out.println(num1 + ch); // int + char to int (66)
         System.out.println(str + num1); // String concatenation
         System.out.println(num1 > value1 * 5); // boolean comparison
    }
}
