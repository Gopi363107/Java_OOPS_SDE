import java.util.*;
//super keyword with constructor call
public class super_constructor {
    public static void main(String[] args) {
        Dog d = new Dog();
        
    }
}

class Animal{
    Animal(){
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog constructor");
    }
}
