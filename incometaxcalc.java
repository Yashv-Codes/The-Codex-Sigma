import java.util.*;
public class incometaxcalc {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        System.out.println("Your Income: "+income);
        int tax;
        sc.close();
        
        if(income<500000){
             tax = 0;
        }
        else if(income>=500000 && income<=1000000){
            tax = (int)(income*0.2);
        }
        else{
            tax = (int)(income*0.3);
        }
        System.out.println("Your Tax is: "+tax);
    }
}

