import java.util.*;
public class Array_basics {
    public static void update(int num[]){
        for(int i=0; i<num.length; i++){
            num[i]+= 1;
        }
    }
    public static void main(String args[]){
        int num[]= {24, 45, 89};
        update(num);
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
    }
}







