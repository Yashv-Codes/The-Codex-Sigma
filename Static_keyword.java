public class Static_keyword {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolname = "BHS";
        
        Student s2 = new Student();
        System.out.println(s2.schoolname);

    }
}

class Student{
    int roll;
    String name;
    static String schoolname;

    void setname(String name){
        this.name = name;
    }

    String getname(){
        return this.name;
    }
}




