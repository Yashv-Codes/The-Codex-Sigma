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
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void main(String args[]){
        printhi(); // function call
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        int x = sc.nextInt();
        System.out.print("Enter no: ");
        int y = sc.nextInt();
        swap(x,y); // arguments or actual parameters
        sc.close();
    }
}





