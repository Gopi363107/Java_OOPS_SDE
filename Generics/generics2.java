import java.util.*;

public class generics2 {
    
    static <T> void print(T data) {
        System.out.println(data);
    }

    public static void main(String[] args) {
        print(10);
        print("Hello");
        print(5.5);
    }
}




