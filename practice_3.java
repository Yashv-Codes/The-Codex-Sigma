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
    public static boolean isPalindrome(int n){
        int reverse = 0;
        while(n>0){
        reverse = n%10;
        n /= 10;
    }
    if (reverse!=n)
        return false;
    return true;
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
        sc.close();
    }
}







