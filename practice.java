import java.util.*;
public class practice{
    public static void butterfly(int n){
        // 1st half
        for(int line=1; line<=n; line++){
            for(int star=1; star<=line; star++){
                System.out.print("* ");
            }
            for(int space=1; space<=2*(n-line); space++){
                System.out.print(" "+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        sc.close();
        
    }
}


    


  







        
        
        
        
        
       


        
         
        
    

