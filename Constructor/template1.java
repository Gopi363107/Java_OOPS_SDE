import java.util.*;

public class template1 {
    public static void main(String[] args) {

        Employee e1 = new Employee("Gopi", 3493, 50000);
        Employee e2 = new Employee("Athi", 4001);
        Employee e3 = new Employee("Kathi");
        Employee e4 = new Employee();

        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}

class Employee {

    private String name;
    private int id;
    private double salary;

    // Constructor 1 : All details
    Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Constructor 2 : Only name & id
    Employee(String name, int id){
        this.name = name;
        this.id = id;
        this.salary = 30000; // default salary
    }

    // Constructor 3 : Only name
    Employee(String name){
        this.name = name;
        this.id = 0;
        this.salary = 0;
    }

    // Constructor 4 : No details (default)
    Employee(){
        this.name = "Unknown";
        this.id = -1;
        this.salary = 0;
    }

    public void display(){
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Salary : " + salary);
        System.out.println("------------------------");
    }
}

