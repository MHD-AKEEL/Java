
public class IndexApp {

    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(" i =" + i + "j =" + j + " , "); // i =0 j =0 , i =0 j =1 ,
                if (i == 0 && j == 1) {
                    break outer;
                }
            }
        }
    }
}
