import java.util.*;

public class practice18 {
    public static void main(String[] args) {
        Animal a = new Animal(){
            void sound(){
                System.out.println("Animal sound");
            }
        };
        a.sound();
    }
}

abstract class Animal{
    abstract void sound();
}


