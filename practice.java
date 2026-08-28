import java.util.*;
public class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        int num = 1;
        for(int line=1; line<=n; line++){
            for(int digit=1; digit<=line; digit++){
                System.out.print(num+" ");
                num++;
            }
        }
        
        sc.close();
        
    }
}


    


  







        
        
        
        
        
       


        
         
        
    

