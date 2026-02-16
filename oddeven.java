import java.util.*;
public class oddeven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println("You entered: " + num);
        if(num%2==0){
            System.out.println("It's an even number");
        } else{
            System.out.println("It's an odd number");
        }
    }
    
}
