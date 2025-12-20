import java.util.*;
public class practice20 {
    
    public static void main(String [] a) throws CloneNotSupportedException{
        Address add = new Address("Chennai");
        Employee e = new Employee(1 , add);
        Employee e1 = (Employee) e.clone();
        e1.address.city = "Bangalore";

        System.out.println(e.address.city);
        System.out.println(e1.address.city);
    }
}

class Address implements Cloneable{
    String city;

    Address(String city){
        this.city = city;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Employee implements Cloneable{
    int id;
    Address address;

    Employee(int id , Address address){
        this.id = id;
        this.address = address;
    }

    public Object clone() throws CloneNotSupportedException{
        Employee emp =  (Employee) super.clone();
        emp.address = (Address) address.clone();
        return emp;
    } 
}