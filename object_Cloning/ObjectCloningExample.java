import java.util.*;

public class ObjectCloningExample {
    public static void main(String[] args) throws CloneNotSupportedException {

        Address addr = new Address("Delhi", "India");
        Student s1 = new Student(1, "Rahul", addr);

        // Clone the object
        Student s2 = (Student) s1.clone();
        s2.address.city = "Mumbai";

        System.out.println("Original Student Address: " + s1.address.city);
        System.out.println("Cloned Student Address: " + s2.address.city);
    }
}

class Student implements Cloneable {
    int id;
    String name;
    Address address;

    Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student clonedStudent = (Student) super.clone(); 
        clonedStudent.address = (Address) address.clone(); // 🔥 deep clone
        return clonedStudent;
    }
}

class Address implements Cloneable {
    String city;
    String state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow is enough here (only primitives & Strings)
    }
}

