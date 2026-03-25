public class Static_keyword {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolname = "BHS";
        System.out.println(s1.schoolname);

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


