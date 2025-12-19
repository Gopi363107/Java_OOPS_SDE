public class practice13 {
    public static void main(String[] args) {
        A a = new B();
        a.show();
    }
}
class A{
    static void show(){
        System.out.println("A");
    }
}

class B extends A{
    static void show(){
        System.out.println("B");
    }
}