import java.util.*;

public class chaining {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Gopi");
        Student s3 = new Student("thamizh" , 8954);
        Student s4 = new Student("Athishankar" , 453,"ML and DL");

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
        s4.displayDetails();
    }
}

class Student{
    // attributes
    private String name;
    private int rollNo;
    private String course;

    Student(){// constructor chaining
        this("undefined" , 0 , "your choice");
    }

    Student(String name){// constructor chaining
        this(name , 0 , "your choice");
    }

    Student(String name , int rollNo){// constructor chaining
        this(name , rollNo , "your choice");
    }

    Student(String name , int rollNo ,String course){ // constructor overloading
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    public void displayDetails(){
        System.out.println("_________Student Details________________");
        System.out.println("Name : "+ name);
        System.out.println("RollNo : "+rollNo);
        System.out.println("Course : "+ course);
        System.out.println("________________________________________");
    }


}
