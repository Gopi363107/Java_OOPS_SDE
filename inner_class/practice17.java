public class practice17 {
    public static void main(String[] args) {
        new Test2().display();
    }
}

class Test2{
    void display(){
        int x = 5;

        class Local{
            void show(){
        
                System.out.println(x);
                System.out.println(x+3);
            }
        }

        Local l = new Local();
        l.show();
    }
}
