import java.util.*;
public class Function_basics{
    public static void printhi(){
        System.out.println("hi");
        return;
    }
    public static int calculatesum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum = "+ (a+b));
        sc.close();
        return 5;
    }
    public static void main(String args[]){
        printhi(); // function call
        calculatesum();
    }
    
}



