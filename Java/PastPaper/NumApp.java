public class NumApp {
    public static void main(String[] args) {
        int val1, val2;
        String val3, val4, val5;
        
        val1 = 5; 
        val2 = 2;
        val2 *= 3; // val2 is now 6
        val3 = Integer.toString(val1); // output "5"
        val4 = Integer.toString(val2); // output "6"
        val5 = val3 + val4; 
        
        System.out.println(val5); // output "56"
    }
}

