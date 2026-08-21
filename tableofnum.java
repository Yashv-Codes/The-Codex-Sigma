import java.util.*;
public class tableofnum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        sc.close();
        for(int i=1; i<=10; i++){
           int table = n*i; 
           System.out.println(n + "*" + i + "=" + table);
        }
    }
}

        





