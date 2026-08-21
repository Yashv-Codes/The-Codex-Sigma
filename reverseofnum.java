import java.util.*;
public class reverseofnum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        sc.close();
        int lastdigit;
        while (n!=0){
             lastdigit = n % 10;
             System.out.print(lastdigit+" "); // just printing digits not building reverse no.
             n = n/10;

        }
        System.out.println();
    }
}
