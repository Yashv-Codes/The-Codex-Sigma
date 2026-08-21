import java.util.*;
public class if_else {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Your age: " +age);
        sc.close();
        if(age>=18){
            System.out.println("Adult: You can vote and drive too");
        }
        else if(age>=13 && age<18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not Teenager nor Adult");
        }
        
        int A = 3, B = 6, C = 9;
        if(A>B && A>C){
            System.out.println("A is the largest");
        }
        else if(B>A && B>C){
            System.out.println("B is the largest");
        }
        else{
            System.out.println("C is the largest");
        }
    }
}










