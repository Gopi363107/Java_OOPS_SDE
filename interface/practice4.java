
interface vehicle{
    void start();
}

class Car implements vehicle{
    public void start(){
        System.out.println("Car starts with key..");
    }
}

public class practice4{
    public static void main(String[] args) {
        vehicle v = new Car();
        v.start();
    }
}