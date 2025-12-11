import java.util.*;

/*Create a class Student with:

Properties:

--name
--rollNo
--course

Create 3 overloaded constructors:

--One with all 3 values
--One with name and rollNo
--One with only name

Method: displayDetails()
Create 3 objects using different constructor*/

public class template2 {
    public static void main(String[] args) {
        Student s1 = new Student("Thamizh S" , 235 , "Machine Learning");
        Student s2 = new Student("Gopinath T" , 453);
        Student s3 = new Student("Athishankar S M");

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}

class Student{

    //Attributes
    private String name;
    private int rollNo;
    private String course;

    //constructor with all details
    Student(String name , int rollNo , String course){
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    //constructor with name and rollNo
    Student(String name , int rollNo){
        this.name = name;
        this.rollNo = rollNo;
        course = "your choice";
    }

    //constructor with only name
    Student(String name){
        this.name = name;
        rollNo = 0;
        course = "your choice";
    }

    //displayDetails method
    public void displayDetails(){
        System.out.println("-------Details of Student------------");
        System.out.println("Name : "+ name);
        System.out.println("Roll Number : "+ rollNo);
        System.out.println("Course : "+ course);
        System.out.println("______________________________________");
    }
}
