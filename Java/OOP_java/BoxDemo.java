class Box {
    double width, height, length;
}

class run {
    int x =15;
    void runFast(){
        System.out.println("Marks");
    }
}
public class BoxDemo {
    public static void main(String args[]) {

        Box my_box1 = new Box();
        Box my_box2 = new Box();
        Box my_box3 = new Box();
        Box my_box4 = new Box();

        my_box1.width = 10;
        my_box1.height = 10;
        my_box1.length = 10;

        my_box2.width = 15;
        my_box2.height = 15;
        my_box2.length = 15;

        my_box3.width = 20;
        my_box3.height = 20;
        my_box3.length = 20;

        my_box4.width = 5;
        my_box4.height = 5;
        my_box4.length = 5;

        double volume1;
        double Volume2;
        double Volume3;
        double Volume4;

        volume1 = my_box1.width * my_box1.height * my_box1.length;
        System.out.println("Volume is = " + volume1);

        Volume2 = my_box2.width * my_box2.height * my_box2.length;
        System.out.println("Volume2 is = " + Volume2);

        Volume3 = my_box3.width * my_box3.height * my_box3.length;
        System.out.println("Volume3 is = " + Volume3);

        Volume4 = my_box4.width * my_box4.height * my_box4.length;
        System.out.println("Volume4 is = " + Volume4);
    
        run r = new run();
        System.out.println(r.x);
        r.runFast();
    }
}
