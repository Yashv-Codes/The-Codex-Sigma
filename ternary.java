import java.util.*;
public class ternary {
    public static void main(String args[]){
        int larger = (5>3)?5:3;
        System.out.println(larger);
        String type = (5%2==0)?"even":"odd";
        System.out.println(type);
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        sc.close();
        String report = (marks>=0 && marks<=33)?"Fail":(marks>=33 && marks<=100)?"Pass":"Invalid Marks";
        System.out.println(report);
    }
}




