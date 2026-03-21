public class Copy_constructor {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "yash";
        s1.roll = 456;

        Student s2 = new Student(s1);

    }
    
}
class Student{
    String name;
    int roll;
    int marks[];

    Student(){
        marks = new int[3];
        System.out.println("constructor is called");
    }

    // copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
    }
}
