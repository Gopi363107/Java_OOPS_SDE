import java.util.*;

public class class_objects1 {
    public static void main(String []a){

        Employee e1 = new Employee();
        e1.name1 = "Alice";
        e1.id1 = 1083761;
        e1.salary1 = 7500;

        Employee e2 = new Employee();
        e2.name1 = "Bob";
        e2.id1 = 1083762;
        e2.salary1 = 6800;

        Employee e3 = new Employee();
        e3.name1 = "Charlie";
        e3.id1 = 1083763;
        e3.salary1 = 9800;

        e1.getDetails();
        e2.getDetails();
        e3.getDetails();
    }


}

class Employee{
    //Attributes
    public String name1;
    public int id1;
    public int salary1;

    //constructor
    public void setDetails(String name , int id , int salary){
        name1 = name;
        id1 = id;
        salary1 = salary;
    }

    //method to get details
    public void getDetails(){
        System.out.println("------------The InfiLearn PVT. LTD.------------");
        System.out.println("Name of employee   : "+ name1);
        System.out.println("ID of employee     : "+ id1);
        System.out.println("Salary of employee : "+ salary1);
        System.out.println("------------------------------------------------");
    }

}
