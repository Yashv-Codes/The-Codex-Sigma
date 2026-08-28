import java.util.*;
public class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        
        for(int line=1; line<=n; line++){
            for(int digit=1; digit<=line; digit++){
                if((line+digit) % 2 == 0)
                    System.out.print(1+" ");
                else{
                    System.out.print(0+" ");
                }
                
            }
            System.out.println();
        }
        
        sc.close();
        
    }
}


    


  







        
        
        
        
        
       


        
         
        
    

