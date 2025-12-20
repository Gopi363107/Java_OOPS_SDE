class Teacher{
    String name;
    
    Teacher(String name){
        this.name = name;
    }
}

class Student{
    void study(Teacher teacher){
        System.out.println("Studying from "+ teacher.name);
    }

}

public class association{
    public static void main(String[] args) {
        Teacher t = new Teacher("Thamizh");
        Student s = new Student();
        s.study(t);
    }
}