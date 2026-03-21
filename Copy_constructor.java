public class Copy_constructor {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "yash";
        s1.roll = 456;
        s1.marks[0] = 99;
        s1.marks[1] = 100;
        s1.marks[2] = 101;

        Student s2 = new Student(s1); // copied
        s1.marks[2] = 100;
        for(int i=0; i<3; i++){
            System.out.print(s2.marks[i]+" ");
        }

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

    //  Shallow copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }
}




