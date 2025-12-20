class Address {
    String city;
    Address(String city) {
        this.city = city;
    }
}

class Employee implements Cloneable {
    int id;
    Address address;

    Employee(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Test {
    public static void main(String[] args) throws Exception {
        Address a = new Address("Chennai");
        Employee e1 = new Employee(1, a);
        Employee e2 = (Employee) e1.clone();

        e2.address.city = "Bangalore";

        System.out.println(e1.address.city);
        System.out.println(e2.address.city);
    }
}


