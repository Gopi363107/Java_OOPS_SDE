import java.util.*;

interface Shop{
    void expenses();
    void profit();
    void total_investment();
}

class Coffee_in implements Shop{
    @Override
    public void expenses(){
        System.out.println("per day expenses is 5000 INR");
    }
    @Override
    public void profit(){
        System.out.println("per day profit arround 10000 to 18000");
    }
    @Override
    public void total_investment(){
        System.out.println("full investment of shop is 10,00,000 ");
    }
}



public class practice5 {
    public static void main(String[] args) {
        Shop s = new Coffee_in();
        s.expenses();
        s.profit();
        s.total_investment();
    }
}
