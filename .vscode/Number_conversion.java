import java.util.*;
public class Number_conversion {
    public static void Binary_to_decimal(int n){
        int new_num = 0;
        int pow = 0;
        while(n>0){
        int last_digit = n%10; // Extract last digit.
        new_num += (last_digit*Math.pow(2,pow)); 
        pow++;
        n /= 10; // Removes last digit.
    }
    System.out.println("Decimal = "+new_num);
}
    public static void Decimal_to_binary(int n){
        int pow = 0;
        int new_num = 0;
        while(n>0){
        int remainder = n%2; // wants only remainder.
        new_num += (remainder*Math.pow(10,pow));
        pow++;
        n /=2; // doing LCM.
    }
    System.out.println("Binary = "+new_num);
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int a = sc.nextInt();
        sc.close();
        Decimal_to_binary(a);
    }
}








