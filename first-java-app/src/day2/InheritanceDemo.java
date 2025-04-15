package day2;


// Composition .. using field
// organization has an employee\
// school has a class
// Vehicle has an engine

// Inheritance .. using extends
// bmw is a car
// car is a vehicle
// surgeon is a doctor



class Vehicle{
    int maxSpeed;
    String color;
    // Engine engine;

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

class Plane extends Vehicle{
    int maxAltitude;

    public Plane(int maxSpeed, String color, int maxAltitude) {
        super(maxSpeed, color);
        this.maxAltitude = maxAltitude;
    }

    public void fly(){
        System.out.println("Flying...");
    }

    @Override
    public String toString() {
        return "Plane [maxSpeed=" + maxSpeed + ", color=" + color + ", maxAltitude=" + maxAltitude + "]";
    }

    
}

public class InheritanceDemo {

    public static void main(String[] args) {
        Car car = new Car(300, "Black", "Tata Nexon");

        Plane plane = new Plane(1000, "Red", 3000);

        // car.maxSpeed = 340;
        System.out.println(car);
        System.out.println(plane);
        plane.start();
        plane.fly();


        // byte b = 20;
        // int j = b;
        // byte c = j;
        // System.out.println(j);

        Vehicle v1 = car;
        Vehicle v2 = plane;

        Vehicle vehicles[] = {v1, v2};

        // side benefit of inheritance is polymorphism
        for(Vehicle v: vehicles){
            v.start();
            System.out.println(v);
        }
    }
    
}
