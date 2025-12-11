import java.util.*;
// Create a class Car with properties model, price, mileage and a method details().

public class practice1 {
    public static void main(String[] args) {
        car c1 = new car("BMW",4500000 , 260.8);
        car c2 = new car("AUDI" , 3400000, 189);
        car c3 = new car("FERARI" , 30050000 , 450.4);

        c1.details();
        c2.details();
        c3.details();
    }
}

class car{
    private String model;
    private int price;
    private double milage;

    car(String model , int price , double milage){
        this.model = model;
        this.price = price;
        this.milage = milage;
    }

    public void details(){
        System.out.println("-------Details of Car Models--------");
        System.out.println("model  : "+ model);
        System.out.println("price  : " + price);
        System.out.println("milage : "+ milage);
        System.out.println("--------------Thank You--------------");
    }

}


