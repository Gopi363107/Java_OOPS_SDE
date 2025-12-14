
import java.util.*;

public class Attributes {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setDetails("David", 1500.75);
        a1.getDetails();
        System.out.println();

        Account a2 = new Account();
        a2.setDetails("Eva", 2450.00);
        a2.getDetails();
        System.out.println();


        Account a3 = new Account();
        a3.setDetails("Frank", 3200.50);
        a3.getDetails();
        System.out.println();

    }
    
}

class Account{

    //attributes
    private String names;
    private double balances;

    //constructor
    public void setDetails(String name , double balance){
        this.names = name;
        this.balances = balance;

    }

    //method to set the details
    public void getDetails(){
        System.out.println("Account Holder Name : " + names);
        System.out.println("Account Balance     : " + balances);
    }

}
