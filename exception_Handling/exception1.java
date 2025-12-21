import java.util.*;

public class exception1 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[6];
            System.out.println("the values of arr[10] :" + arr[10]);
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithemetic error comes");
        } 
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds in th program");
        }
        System.err.println("program continues.");
    }
}
