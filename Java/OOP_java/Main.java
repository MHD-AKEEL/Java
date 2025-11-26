
class Car {
    String color;
    int maxSpeed;

    void displayInfo() {
        System.out.println("Color: " + color + ", Max Speed: " + maxSpeed);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.maxSpeed = 200;
        myCar.displayInfo();
    }
    
}
