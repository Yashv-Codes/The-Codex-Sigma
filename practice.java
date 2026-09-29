public class practice {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "yash";
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

   Student(Student s1){
    marks = new int[3];
    this.name = s1.name;
    this.roll = s1.roll;
    this.marks = s1.marks;

   }
}

        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

