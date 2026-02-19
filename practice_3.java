import java.util.*;
public class practice_3 {
    public static double Avg_of_num(double a, double b, double c){
        return (a+b+c)/3;
    }
    public static boolean isEven(int n){
        if(n%2!=0)
            return false;
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        System.out.println(isEven(n));
        sc.close();
    }
}






