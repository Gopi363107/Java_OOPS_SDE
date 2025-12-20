public class shallow_clone {
    public static void main(String[] args) throws Exception{
        Student s1 = new Student("GD73","Gopi");
        Student s2 = (Student) s1.clone();
        s2.name = "Athi";

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}

class Student implements Cloneable{
    String id;
    String name;

    Student(String id , String name){
        this.id = id;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
