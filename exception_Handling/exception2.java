import java.util.*;

public class exception2 {
    public static void main(String[] args) {
        try {
            int a = 20 / 0;
        } catch (Exception e) {
            System.out.println("divide by zero error");
        } finally {
            System.out.println("Must change the denominator value is must > then zero");
        }
    }
}
