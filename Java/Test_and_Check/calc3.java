public class calc3 {
    public static void main(String[] args){
        int num1 = 25;
        int num2 = 40;
        char value1 = (char)(num1 + num2); // 25 + 40 = 65 -> 'A'

        System.out.println(value1);

        char ch1 = 'A';
        char ch2 = 'B';
        char ch3 = ch1 * ch2; // error: incompatible types: possible lossy conversion from int to char

        System.out.println(ch1 + ch2); // 'A' + 'B' = 65 + 66 = 131
        System.out.println(ch3);

        
    }
}
