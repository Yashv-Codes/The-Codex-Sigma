import java.util.*;
public class Function_basics{
    public static void printhi(){
        System.out.println("hi");
        return;
    }
    public static void calculatesum(int a, int b){ // parameters or formal parameters
        int sum = a+b;
        System.out.println("Sum = "+ sum);
    }
    public static void main(String args[]){
        printhi(); // function call
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        calculatesum(a,b); // arguments or actual parameters
    }
    
}



