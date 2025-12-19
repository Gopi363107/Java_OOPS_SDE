
public class practice16 {
    public static void main(String[] args) {
        outer o = new outer();
        outer.inner i = o.new inner();
        outer.inner.Inner v = i.new Inner();
        v.show();
    }
}

class outer{
    int x = 20;
    int y = 30;
    int z = 50;

    class inner{
        int a = 5;
        int b = 7;
        int c = 9;

        class Inner{
            void show(){
                System.out.println("the outer class addition "+ (x+y+z));
                System.out.println("the inner class addition " + (a+b+c));
            }
        }
    }
}
