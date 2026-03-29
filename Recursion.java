public class Recursion {

    // Print in decreasing order
    public static void printdec(int n){
        if(n==1){ // BASE CASE
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printdec(n-1); // recursive call
    }

    // Print in increasing order
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1); // go to smaller problem first
        System.out.print(n+" "); // return phase
    }

    // To calculate factorial
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int Nm1 = fact(n-1);
        int Fn = n * Nm1;
        return Fn;
    }


    public static void main(String[] args){
        // printdec(10);
        // printInc(5);
        System.out.println(fact(7));

    }
}










