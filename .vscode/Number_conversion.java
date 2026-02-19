import java.util.*;
public class Number_conversion {
    public static void Binary_to_decimal(int n){
        int new_num = 0;
        int pow = 0;
        while(n>0){
        int last_digit = n%10;
        new_num += (last_digit*Math.pow(2,pow)); 
        pow++;
        n /= 10;
    }
    System.out.println("Decimal = "+new_num);
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int a = sc.nextInt();
        sc.close();
        Binary_to_decimal(a);
    }
}



