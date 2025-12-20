public class composition {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}

class Engine{
    void start(){
        System.out.println("Engine is started..");
    }
}

class Car{
    private Engine engine = new Engine();

    void drive(){
        engine.start();
        System.out.println("car moving.");
    }
}
