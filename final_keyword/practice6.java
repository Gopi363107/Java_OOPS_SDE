import java.util.*;

//🧪 PRACTICE TASK (IMPORTANT)
/* Create a final class Bank
   with final variable IFSC_CODE
   and final method displayIFSC()
   Try inheriting it and observe error 
*/

final class Bank{
    final String IFSC_CODE = "SBIN0001007";

    final void displayIFSC(){
        System.out.println("Your IFSC code is " + IFSC_CODE);
    }
}
public class practice6 {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.displayIFSC();
    }
}
