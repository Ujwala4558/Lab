public class Car {
    private int speed;
    private String name;
    private String color;
    private int enginePower;

    public Car() {

    }

    public void accelerate() {
        System.out.println("The car is accelerating…");
    }

    public void setSpeed(int speed) {
        System.out.println("The car is " + speed);
    }

    public int getSpeed() {
        return speed;
    }
}

// Declare a sub car class
public class Toyota extends Car {
    private int registrationNumber;
    private int engineNumber;


    public Toyota() {
        // Toyota constructor calling the constructor of the superclass
        super();
    }
}