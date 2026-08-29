import java.util.*;
public class practice{
    public static void number_pyramid(int n){
        for(int line=1; line<=n; line++){
            for(int space=1; space<=n-line; space++){
                System.out.print("  ");
            }
            for(int digit=1; digit<=line; digit++){
                System.out.print(digit+" ");
            }
            System.out.println();
        }
        
    }
        
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        number_pyramid(n);
        sc.close();
        
    }
}


    


  







        
        
        
        
        
       


        
         
        
    

