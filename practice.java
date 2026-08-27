import java.util.*;
public class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();

        if(n <= 1){
            System.out.println("Not prime");
            return;
        }
        else{
            for(int i=2; i<n; i++){
                if(n % i == 0){
                    System.out.println("Not prime");
                    return;
                }
            }
            System.out.println("Prime no");
        }
        
    }
}

    


  







        
        
        
        
        
       


        
         
        
    

