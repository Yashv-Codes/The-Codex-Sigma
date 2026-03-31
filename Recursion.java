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

    // Sum of first N natural no
    public static int printsum(int n){
        if(n==1){
            return n;
        }
        int solution = printsum(n-1);
        int sum  = n+solution;
        return sum;
    }

    // Fibonacci Series
    public static int calcfib(int n){
        if(n==0 || n==1){
            return n;
        }
        int f1 = calcfib(n-1);
        int f2 = calcfib(n-2);
        return f1+f2;
    }

    // Check if sorted array
    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1) // Works as edge case
            return true;

        if(arr[i] > arr[i+1])
            return false;

        return isSorted(arr,i+1); 
    }

    // To find first occurence
    public static int firstOccurence(int arr[], int i, int key){
        if(i==arr.length)
            return -1;

        if(arr[i]==key)
            return i;

        return firstOccurence(arr,i+1,key); // Recursive call
    }

    // To find last occurence
    public static int lastOccurence(int arr[], int key, int i){
        if(i==arr.length)
            return -1;

        int isFound = lastOccurence(arr,key,i+1); 
        // --- EVERYTHING BELOW THIS LINE HAPPENS ON THE WALK BACK ---
        if(isFound==-1 && arr[i]==key)
            return i;

        return isFound;
    }

    // Calculate power
    public static int power(int x, int n){
        if(n==0)
            return 1;

        return x * power(x,n-1);
    }

    // Optimized power
    public static int optimizedpower(int x, int n){
        if(n==0)
            return 1;

        int solution = optimizedpower(x, n/2);
        int halfpowsq = solution * solution;
        // for odd
        if(n % 2 != 0)
            return x * halfpowsq;

        return solution;
    }
    
    public static void main(String[] args){
        // printdec(10);
        // printInc(5);
        // System.out.println(fact(7));
        // System.out.println("Total sum = "+printsum(10));
        // System.out.println(calcfib(5));
        // int arr[] = {8,3,6,9,5,10,2,5,3};
        // System.out.println(lastOccurence(arr,5,0));
        // System.out.println(power(5,10));
        System.out.println(optimizedpower(2,7));
    }
}























