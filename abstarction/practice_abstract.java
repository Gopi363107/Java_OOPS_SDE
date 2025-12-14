import java.util.*;

/*Create an abstract class Vehicle with:

abstract method start()
concrete method fuelType()

Create child classes:

Car
Bike
Implement start() differently in each. */

public class practice_abstract {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.fuelType();
        v.start();

        System.out.println();

        v = new Bike();
        v.fuelType();
        v.start();

    }

}

abstract class Vehicle{
    abstract void start();

    void fuelType(){
        System.out.println("vehicle uses the fuel");
    }
}

class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("Car is starting...");
    }

    @Override
    public void fuelType(){
        System.out.println("Car uses the diesel or petrol");
    }
}

class Bike extends Vehicle{
    @Override
    public void start(){
        System.out.println("vehicle is starting...");
    }

    @Override
    void fuelType(){
        System.out.println("bike uses diesel or petrol");
    }
}
