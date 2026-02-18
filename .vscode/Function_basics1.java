import java.util.*;
public class Function_basics1 {
    public static int calcproduct(int a, int b){
        int product = a * b;
        return product;
    }
    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact*= i;
        }
        return fact;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int x = sc.nextInt();
        System.out.println("Factorial = " +factorial(x));
        sc.close();
    }
    
}


