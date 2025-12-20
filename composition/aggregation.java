public class aggregation {
    public static void main(String[] args) {
        Department d = new Department("CSE");
        Employee e = new Employee(d);
        e.show();
    }
}

class Department{
    String name;

    Department(String name){
        this.name = name;
    }
}

class Employee{
    Department dept;

    Employee(Department dept){
        this.dept = dept;
    }

    void show(){
        System.out.println("Department name is "+ dept.name);
    }
}
