import java.util.*;
public class oddeven_sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int evensum = 0, oddsum = 0;
        for(; ;){
            System.out.print("Enter a no: ");
            int n = sc.nextInt();
            if(n==0)
                break;
            if(n%2==0){
                System.out.println("You entered an even number");
                evensum+=n;
            }
            else{
                System.out.println("You entered an odd number");
                oddsum+=n;
            }
        }
        System.out.println("Sum of even numbers = "+evensum);
        System.out.println("Sum of odd numbers = "+oddsum);
        sc.close();
    }
}


