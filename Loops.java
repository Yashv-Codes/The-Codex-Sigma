import java.util.*;
public class Loops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        int n = sc.nextInt();
        sc.close();       
        // int i = 0, sum = 0;
        // while (i<=num){
        //     sum += i;
        //     i++;
        // }
        // System.out.println("Total = "+ sum);
        int i =0;
        do{
            System.out.println("Hello, World!");
            i++;
        } while (i<=n);
    }
}


