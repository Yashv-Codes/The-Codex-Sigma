import java.util.*;
public class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum_even = 0;
        int odd_sum = 0;
        for(int i=1; i<=20; i++){
            if(i % 2 == 0)
                sum_even += i;
            else{
                odd_sum += i;
            }
        }
        System.out.println("Sum of even integers are: "+sum_even);
        System.out.println("Sum of odd integers are: "+odd_sum);
    }
}


    


  







        
        
        
        
        
       


        
         
        
    

