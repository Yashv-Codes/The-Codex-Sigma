public class practice {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "yash";
        s1.roll = 124;
        s1.marks[0] = 11;
        s1.marks[1] = 12;
        s1.marks[2] = 13;
        Student s2 = new Student(s1);
        for(int i=0; i<3; i++){
            System.out.println()
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

//    Student(Student s1){ // Shallow copy
//     marks = new int[3];
//     this.name = s1.name;
//     this.roll = s1.roll;
//     this.marks = s1.marks;

//    }

    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<3; i++){
            this.marks[i] = s1.marks[i];
        }
    }
}

        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

