import java.util.*;
public class IsPrime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        sc.close();
        if(n<=1){
            System.out.println("Not Prime");
            return;
        }
        else{
            for(int i=2; i<n; i++){
                if(n%i==0){
                    System.out.println("Not Prime");
                    return;
                }
            }
            System.out.println("Prime no");
        }
    }
}
                
        
             
    




