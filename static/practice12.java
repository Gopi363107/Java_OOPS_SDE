public class practice12 {
    public static void main(String[] args) {
        System.out.println(A.x);
    }
}
class A{
    static int x = 5;
    static{
        x += 5;
    }
}