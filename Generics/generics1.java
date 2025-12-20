import java.util.*;

public class generics1 {
    public static void main(String[] a){
        Box<Integer> b1 = new Box<>();
        b1.set(10);

        Box<String> b2 = new Box<>();
        b2.set("GopiNath");

        System.out.println(b1.get());
        System.out.println(b2.get());

    }
}

class Box<T>{
    T value;

    void set(T value){
        this.value = value;
    }

    public T get(){
        return value;
    }
}
