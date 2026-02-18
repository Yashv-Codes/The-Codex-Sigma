public class Function_overloading {
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return (a+b);
    }
    public static boolean isPrime(int n){
        if(n<=1){
            System.out.println("Not Prime");
            return false;
        }
        else{
             boolean isPrime = true;
            for(int j=2; j<=Math.sqrt(n); j++){
                if(n%j==0){
                    isPrime = false;
                }
            }
            return isPrime;
        }
     }
    public static void main(String args[]){
        int n = 20;
        int i;
        for(i=1; i<=n; i++){
            isPrime(i);
        }
        System.out.println(i+" ");
    }
}


