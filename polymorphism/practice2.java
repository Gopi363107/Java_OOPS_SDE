
/* Create a class MathOperation with overloaded methods calculate():

   1) calculate(int a, int b) → addition
   2) calculate(double a, double b) → multiplication
   3) calculate(int a, int b, int c) → average
*/

class MathOperation{
    public int calculate(int a , int b){
        return a + b;
    }

    public double calculate(double a , double b){
        return a * b ;
    }

    public double calculate(int a , int b , int c){
        return (a + b + c)/3.0 ;
    }
}
public class practice2 {
    public static void main(String[] args) {

        MathOperation func = new MathOperation();
        //Method overloading
        System.out.println(func.calculate(3, 9));
        System.out.println(func.calculate(5.3 , 9.2));
        System.out.println(func.calculate(5,9,2));

    }
}
