
public class practice15 {
   public static void main(String[] args) {
        outer o = new outer();
        outer.inner i = o.new inner();
        i.show();
   } 
}

class outer{
    int x = 10;

    class inner{
        void show(){
            System.out.println(x);
        }
    }
}
