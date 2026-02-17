import java.util.*;
public class Function_basics1 {
    public static int calcproduct(int a, int b){
        int product = a * b;
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int x = sc.nextInt();
        System.out.print("Enter second no: ");
        int y = sc.nextInt();
        System.out.println("Product = "+calcproduct(x,y));
        sc.close();
    }
    
}
