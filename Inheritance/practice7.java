//single inheritance
class A{
    void show(){
        System.out.println("A class method..");
    }
}

class B extends A{}

public class practice7{
    public static void main(String[] args) {
        B e  = new B();
        e.show();
    }
}