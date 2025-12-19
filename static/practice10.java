
public class practice10{
    public static void main(String[] args) {
        Student s1 = new Student("Gopi Nath T");
        Student s2 = new Student("Athishankar S M");

        s1.display();
        s2.display();
    }
}

class Student{
    static String college = "IIT";
    String name;

    Student(String name){
        this.name = name;
    }

    public void display(){
        System.out.println(name +" is Studying in "+college);
        
    }
}
 