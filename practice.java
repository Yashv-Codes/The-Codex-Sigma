import java.util.*;
public class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if(year % 4 == 0)
            System.out.println("Regular Leap year");
        else if(year % 100 == 0)
            System.out.println("Not a Leap year");
        else if(year % 400 == 0)
            System.out.println("Century Leap year");
        else{
            System.out.println("Not a Leap year");
        }
        sc.close();
    }
    
}





        
        
        
        
        
       


        
         
        
    

