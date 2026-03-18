public class Constructors {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student("Yash");
        System.out.println(s1.getName());
    }
}

    class Student{
        private String name;
        int roll;

        // Non-parameterized constructor
        Student(){
            System.out.println("cons.. is called");
        }

        // Parameterized constructor
        Student(String name){
            this.name = name;
        }
        String getName(){
            return name;
        }
    }







