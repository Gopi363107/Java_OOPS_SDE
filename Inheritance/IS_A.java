public class IS_A {
    public static void main(String[] a){
        // valid
        Animal b = new Dog();
        Dog d = new Dog();
        //error
        //Dog g = new Animal();

        //using instanceof
        Dog g = new Dog();
        System.out.println(g instanceof Dog);
        System.out.println(g instanceof Animal);

    }
}

class Animal{}

class Dog extends Animal{}