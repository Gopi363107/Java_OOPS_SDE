import java.util.*;

/*Q3: Write code:

Parent class Shape

Child Circle

Use instanceof to safely call drawCircle() after casting */
interface Shape{
    void draw();
}

class Circle implements Shape{

    public void draw(){
        System.out.println("draw the Shape");
    }

    public void drawCircle(){
        System.out.println("draw a new circle");
    }
}
public class practice_instanceof {
    public static void main(String[] args) {
        Shape s = new Circle();
        
        if(s instanceof Circle){
            Circle c = (Circle) s;
            c.drawCircle();
        }
    }
}
