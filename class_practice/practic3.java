import java .util.*;

//Create a class Employee with id, name and a method to print salary.
public class practic3{
    public static void main(String[] args) {
        Employee e1 = new Employee("Gopi" , 3493 , 34000);
        Employee e2 = new Employee("Athi" , 4394 , 56000);
        Employee e3 = new Employee("Kathiresan" , 4953 , 67000);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}

class Employee{

    //attributes
    private String name;// Java convention → variable names start with lowercase.
    private int id;
    private double salary;

    //constructors
    Employee(String name ,int id, double salary ){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //getters method 
    public void displayDetails(){
        System.out.println("---------- Employee Details---------------");
        System.out.println("Name : "+ name);
        System.out.println("Id : "+id);
        System.out.println("Salary : ₹"+salary);
        System.out.println("___________________________________________");
    }

} 