import java.util.*;

public class interface_payment {
    public static void main(String[] args) {
        Payment p = new GooglePay();
        p.pay();

        p = new PhonePe();
        p.pay();

        p = new UPI();
        p.pay();

        p = new Paytm();
        p.pay();

    }
}

interface Payment{
    void pay();
}

class UPI implements Payment{

    public void pay(){
        System.out.println("Paid by UPI");
    }
}

class GooglePay implements Payment{

    public void pay(){
        System.out.println("Payment via Google pay");
    }
}

class PhonePe implements Payment {

    public void pay(){
        System.out.println("Payment via PhonePe");
    }
}

class Paytm implements Payment{

    public void pay(){
        System.out.println("Payment via Paytm");
    }
}



