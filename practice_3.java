import java.util.*;
public class practice_3 {
    public static boolean isEven(int n){
        if(n%2!=0)
            return false;
        return true;
    }
    public static boolean isPalindrome(int n){
        int original = n;
        int reverse = 0;
        while(n>0){
        int lastdigit = n%10;
        reverse = reverse*10+lastdigit;
        n /= 10;
    }
    if (reverse!=original)
        return false;
    return true;
}
    public static int sumofdigits(int n){
        int sum = 0;
        while(n>0){
            int last_digit = n%10;
            sum+= last_digit;
            n /=10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        System.out.println(sumofdigits(n));
        sc.close();
    }
}












