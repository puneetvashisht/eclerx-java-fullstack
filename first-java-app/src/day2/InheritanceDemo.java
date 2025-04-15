package day2;

// organization has an employee

// bmw is a car
// car is a vehicle

class Vehicle{
    int maxSpeed;
    String color;

    public Vehicle(){

    }
    public Vehicle(int maxSpeed, String color) {
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public void start(){
        System.out.println("Vehicle starting...");
    }
}
class Car extends Vehicle{
    String model;

    public Car(){
        super();
    }
    public Car(int maxSpeed, String color, String model) {
        super(maxSpeed, color);
        this.model = model;
    }
    @Override
    public String toString() {
        return "Car [maxSpeed=" + maxSpeed + ", color=" + color + ", model=" + model + "]";
    }

    
}

public class InheritanceDemo {

    public static void main(String[] args) {
        Car car = new Car(300, "Black", "Tata Nexon");
        // car.maxSpeed = 340;
        System.out.println(car);
    }
    
}
