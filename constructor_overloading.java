
public class constructor_overloading {

    public static void main(String[] args) {
            method_constructor c1 = new method_constructor(24);
            method_constructor c2 = new method_constructor("Alice");
            method_constructor c3 = new method_constructor("Bob", 30);

            sample_method s1 = new sample_method("Mathematics", 95);
            s1.getDetails();
            sample_method s2 = new sample_method("Science", 88);
            s2.getDetails();


    }
}

class method_constructor{

    private int age;
    private String name;

    //constructors
    method_constructor(int age1){
        age = age1;
        System.out.println("Age: " + age);
    }

    method_constructor(String name1){
        name  = name1;
        System.out.println("Name: " + name);
    }

    method_constructor(String name1, int age1){
        name = name1;
        age = age1;
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class sample_method{

    private String subject1;
    private int grade1;

    sample_method(String subject, int grade){
        subject1 = subject;
        grade1= grade;
    }

    public void getDetails(){
        System.out.println("Subject: " + subject1 + ", Grade: " + grade1);
    }
}
