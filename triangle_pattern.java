import java.util.*;
public class triangle_pattern {
    public static void zero_one_pattern(int n){
        for(int line=1; line<=n; line++){
            for(int num=1; num<=line; num++){
                if((line+num)%2==0)
                    System.out.print("1"+ " ");
                else
                    System.out.print("0"+ " ");
                }
                System.out.println();
            }
        }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        zero_one_pattern(n);
        sc.close();

    }
}



