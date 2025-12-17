import java.util.*;

public class super_variables {
    public static void main(String[] args) {
        Dog a = new Dog();
        a.printColor();

        Cat c = new Cat();
        c.printColor();
    }
}
// super key word with variables
class Animal{
    String color = "Blue";
}

class Dog extends Animal{
    String color = "Red";

    void printColor(){
        System.out.println("Dog class...");
        System.out.println(color);
        System.out.println(super.color);
    }
}

class Cat extends Animal{
    String color = "Pink";

    void printColor(){
        System.out.println("Cat class ...");
        System.out.println(super.color);
        System.out.println(color);
    }
}
