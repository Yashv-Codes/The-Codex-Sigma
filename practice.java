import java.util.*;
public class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        
        for(int line=n; line>=1; line--){
            
            for(int digit=1; digit<=line; digit++){
                System.out.print(digit+" ");
            }
            System.out.println();
            
        }
        sc.close();
        
    }
}


    


  







        
        
        
        
        
       


        
         
        
    

