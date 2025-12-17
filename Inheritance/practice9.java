/*Rules:

Create three classes:

Animal (parent)

Dog (child of Animal)

Puppy (child of Dog)

Each class must have a method sound()

Override sound() in each child class

In main():

Use Animal reference

Store Puppy object

Call sound()

Predict the output */
public class practice9 {
    public static void main(String[] args) {
        Animal a = new Puppy();
        a.sound();

        Animal b = new Dog();
        b.sound();
    }
}

class Animal{
    void sound(){
        System.out.println("Animals have own sound..");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Barks..");
    }
}

class Puppy extends Dog{
    @Override
    void sound(){
        System.out.println("Puppy barks..");
    }
}

