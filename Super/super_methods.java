import java.util.*;

// super keyword with methods
public class super_methods {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();

        Snake s = new Snake();
        s.sound();

        Cat c = new Cat();
        c.sound();
    }
}

class Animal{
    void sound(){
        System.out.println("Animal sound..");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog class ...");
        super.sound();
        System.out.println("Dog barks..");
        System.out.println();
    }
}

class Snake extends Animal{
    void sound(){
        System.out.println("Snake class ..");
        super.sound();
        System.out.println("snake Sssss....");
        System.out.println();
    }
}

class Cat extends Dog{
    void sound(){
        System.out.println("Cat class ..");
        super.sound();
        System.out.println("Cat Meooo...");
        System.out.println();
    }
}


