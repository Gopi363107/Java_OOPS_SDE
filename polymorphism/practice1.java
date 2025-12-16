/* Create a class Shape with method draw()
   Create subclasses:
      Circle
      Rectangle
   Override draw()
   Call using Shape reference */

class Shape{
    void draw(){
        System.out.println("Draw the shapes.");
    }
}

class Circle extends  Shape{
    @Override
    void draw(){
        System.out.println("Draw the Circle.");
    }
}

class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Draw the Rectangle.");
    }
}

public class practice1 {
    public static void main(String[] args) {
        Shape d1 = new Circle();
        d1.draw();

        System.out.println();
        Shape d2 = new Rectangle();
        d2.draw();
    }
}
