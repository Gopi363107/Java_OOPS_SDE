package class_objects;
public class class_objects {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.brand = "Lenovo";
        l1.ram = 16;

        Laptop l2 = new Laptop();
        l2.brand = "Dell";
        l2.ram = 8;

        Laptop l3 = new Laptop();
        l3.brand = "MacBook";
        l3.ram = 16;

        Laptop l4 = new Laptop();
        l4.brand = "Hp";
        l4.ram = 8;

        l1.turnOn();
        l2.turnOn();
        l3.turnOn();
        l4.turnOn();
    }
}

class Laptop{
    String brand;
    int ram;

    void turnOn(){
        System.out.println(brand +" is turning on...." +" with " + ram + "GB RAM");
    }
}
