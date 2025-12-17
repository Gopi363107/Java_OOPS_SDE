
// multilevel inheritance
public class practice8 {
    public static void main(String[] args) {
        Car c = new Car();
        c.wheels();
        c.diesel();
        System.out.println();

        Bike b = new Bike();
        b.wheels();
        b.diesel();
    

    }
}

class Car extends MotorVehicles{
    Car() {
        System.out.println("Car starting..");
    }
    void wheels(){
        System.out.println("Car have four wheels");
    }
}

class Bike extends MotorVehicles{
    Bike(){
        System.out.println("Bike is starting..");
    }

    void wheels(){
        System.out.println("Bike have two wheels");
    }


}

class MotorVehicles{
    void wheels(){}
    void diesel(){
        System.out.println("it uses to drive the diesel..");
    }
}


