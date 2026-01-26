
class HelloApp {

    public static void main(String[] args) {
        char ch = 'A';
        int count = 0;
        while (count < 5) {
            System.out.print(ch); //ABCDE     current character
            ch += 2;
            count++;
            System.out.println(ch);
        }
    }
}

