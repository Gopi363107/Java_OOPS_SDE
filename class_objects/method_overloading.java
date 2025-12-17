package class_objects;
import java.util.*;

// Method overloading 
// same method name mutiple time used with different parameters

class overloading{

    public int add(int a , int b){
        return a + b;
    }

    public int add(int a , int b , int c){
        return a + b + c;
    }

    public double add(double a , double b){
        return a + b;
    }
}

public class method_overloading{
    public static void main(String[] args) {
        overloading n1 = new overloading();
        System.out.println("Addition of 2 integers : " + n1.add(5,7));
        System.out.println("Addition of 2 doubles : " + n1.add(3.9,9.7));
        System.out.println("Addition of 3 integers : " + n1.add(4,7,5));

    }
}