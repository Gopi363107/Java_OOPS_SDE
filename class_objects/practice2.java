package class_objects;
import java.util.*;
//Create a class BankAccount with deposit() and withdraw()

public class practice2 {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Gopinath" , "297DHE8SYY");
        BankAccount a2 = new BankAccount("NAGAMANI" ,"SJ374FD93");
        BankAccount a3 = new BankAccount("Athi shankar" , "3898FKDY9" );

        a1.deposit(0);
        a2.deposit(5600000);
        a3.deposit(9800000);

        a1.withdraw(34000);
        a2.deposit(890000);
        a3.withdraw(320000);
        a2.withdraw(56000);
    }
}

class BankAccount{

    private String name;
    private String acc_no;
    private double balance;

    
    BankAccount(String name , String acc_no ){
        this.name = name;
        this.acc_no = acc_no;
        this.balance = 0.0;
    }

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("---------- STATE BANK OF INDIA ------------------");
        System.out.println("Name : " + name);
        System.out.println("Account no : "+ acc_no);
        System.out.println("Total balance : "+ balance);
        System.out.println("-------------------------------------------------");
        System.out.println("Your amount "+ amount +" successfully deposited.");
        System.out.println("-------------------------------------------------");
    }

    public void withdraw(double amount){
        if(amount < balance){
            balance -= amount; 
            System.out.println("---------- STATE BANK OF INDIA ------------------");
            System.out.println("Name : " + name);
            System.out.println("Account no : "+ acc_no);
            System.out.println("Total balance : "+ balance);
            System.out.println("-------------------------------------------------");
            System.out.println("Your amount "+ amount +" successfully debited.");
            System.out.println("-------------------------------------------------");
        }
        else{
            System.out.println("--------------STATE BANK OF INDIA-----------------");
            System.out.println("You don't have this amount in your bank account");
            System.out.println("your total balance : "+ balance);
            
            System.out.println("---------------Thank you for choosing us--------------");        
        }
        
    }

}
