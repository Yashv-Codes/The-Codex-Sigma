import java.util.*;
public class Assignment2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    //     do {
    //         System.out.print("Enter your no: ");
    //         int n = sc.nextInt();
    //         if (n%10==0)
    //             break;
    //         System.out.print("You entered: "+n);
    //         System.out.println();
            
    //     }while(true);
    //     sc.close();
    // }
        while(true){
            System.out.print("Enter a no: ");
            int n = sc.nextInt();
            if (n%10==0)
                break;
            System.out.print("You entered: "+n);
            System.out.println();
        }
        sc.close();
    }
}


