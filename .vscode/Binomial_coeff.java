public class Binomial_coeff {
    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        System.out.println("Factorial = "+fact);
        return fact;
    }

    public static void bino_coeff(int n, int r){
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);

        int Bino_coeff = a/b*c;
        System.out.println("Binomial Co-eff = "+Bino_coeff);
    }
    public static void main(String args[]){
        bino_coeff(7, 5);

    }
    
}
