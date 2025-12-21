import java.util.*;

public class practice21 {
    public static void main(String[] args) {
        try{
            int a = 10 / 0;
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by 0");
        }
        System.out.println("a throws exception");
    }
}

