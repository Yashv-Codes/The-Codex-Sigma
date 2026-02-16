import java.util.*;
public class factorial_sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        sc.close();
        int factorial = 1, sum = 0;
        for(int i=1;i<=n;i++){
            factorial *= i;
            sum += factorial;
        }
        System.out.println("Factorial = "+factorial);
        System.out.println("Sum = "+sum);

    }
    
}

