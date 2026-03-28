public class Recursion {

    // Print in decreasing order
    public static void printdec(int n){
        if(n==1){ // BASE CASE
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printdec(n-1); // func calls itself -> recursive func.
    }

    // Print in increasing order
    public static void printInc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printInc(n-1); // 
    }


    public static void main(String[] args){
        printdec(10);

    }
}






