import java.util.*;
public class practice{
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i]+1;
        }
    }

        
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int marks[] = new int[n];
        // taking input
        for(int i=0; i<marks.length; i++){
            System.out.print("Enter marks: "+marks[i]);
        }
        System.out.println();
        update(marks);
        // print array
        
        
        
        
        
        
        
        
        sc.close();
        
        
       
    }
}
    

