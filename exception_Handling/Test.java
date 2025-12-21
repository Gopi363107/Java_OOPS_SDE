public class Test {
    static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible");
        }
        System.out.println("Eligible");
    }

    public static void main(String[] args) {
        validate(19);
    }
}
