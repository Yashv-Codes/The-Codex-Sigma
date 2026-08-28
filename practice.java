import java.util.*;
public class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        char ch = 'A';
        for(int line=1; line<=n; line++){
            for(int char=1; char<=line; char++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        sc.close();
        
    }
}


    


  







        
        
        
        
        
       


        
         
        
    

