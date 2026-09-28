public class practice {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Yash", 124);
        System.out.println(s2.name+" , "+s2.roll);
        
        
    }
}
class Student{
    String name; 
    int roll;
    Student(){
         System.out.println("constructor is called");
        
    }
    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
}

        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

