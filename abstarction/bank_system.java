import java.util.*;

abstract class Bank{

    abstract void withdraw(double amount);// abstract method

    void deposit(double amount){//concrete method
        System.out.println("Amount deposited :"+ amount);
    }
}
public class bank_system {
    public static void main(String[] args) {
       Bank bank = new SBI();
       bank.deposit(5000);
       bank.withdraw(2000);
    }
}

class SBI extends Bank{

    @Override
    void withdraw(double amount){
        System.out.println("SBI withdrawl : "+ amount);
    }
}
