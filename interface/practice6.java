import java.util.*;

interface Payment_Method{
    void deposit();
    void withdraw();
}

interface Govt{
    void UPI();
    void Rules();
}

class GooglePay implements Payment_Method,Govt {

    @Override
    public void deposit(){
        System.out.println("Your amount is processing via GooglePay...");
        System.out.println("your amount is deposited.");
    }
    @Override
    public void withdraw(){
        System.out.println("you amount is debited via GooglePay.");
    }
    @Override 
    public void Rules(){
        System.out.println("The goverment all rules are followed in the Payment Method ...");
        System.out.println();
    }
    @Override
    public void UPI(){
        System.out.println("UPI Processed...");
    }
}

class PayPal implements Payment_Method ,Govt {
    @Override
    public void deposit(){
        System.out.println("Your amount is processing via PayPal...");
        System.out.println("your amount is deposited.");
    }
    @Override
    public void withdraw(){
        System.out.println("you amount is debited via PayPal.");
    }

    @Override 
    public void Rules(){
        System.out.println("The goverment all rules are followed in the Payment Method ...");
        System.out.println();
    }
     @Override
    public void UPI(){
        System.out.println("UPI Processed...");
    }
}

class Paytm implements Payment_Method , Govt{
    @Override
    public void deposit(){
        System.out.println("Your amount is processing via Paytm...");
        System.out.println("your amount is deposited.");
    }
    @Override
    public void withdraw(){
        System.out.println("you amount is debited via Paytm.");
    }

    @Override 
    public void Rules(){
        System.out.println("The goverment all rules are followed in the Payment Method ...");
        System.out.println();
    }
    @Override
    public void UPI(){
        System.out.println("UPI Processed...");
    }
}

public class practice6 {
    public static void main(String[] args) {

        Payment_Method p1 = new GooglePay();
        p1.deposit();
        p1.withdraw();

        Govt p2 = new GooglePay();
        p2.UPI();
        p2.Rules();

        Payment_Method p3 = new PayPal();
        p3.deposit();
        p3.withdraw();

        Govt p4 = new PayPal();
        p4.UPI();
        p4.Rules();

        Payment_Method p5 = new Paytm();
        
        p5.deposit();
        p5.withdraw();

        Govt p6 = new Paytm();
        p6.UPI();
        p6.Rules();
    }
    
}
