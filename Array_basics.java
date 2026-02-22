import java.util.*;
public class Array_basics {
    public static void update(int num[]){
        for(int i=0; i<num.length; i++){
            num[i]+= 1;
        }
    }
    public static int Linear_search(String fruits[], String key){
        for(int i=0; i<fruits.length; i++){
            if(fruits[i]==key)
                return i;
             }
        return -1;
    }
    public static void main(String args[]){
        int num[]= {1, 2, 3, 78, 34, 56, 8, 7};
        String fruits[]= {"Apple", "Mango", "Banana", "Guava"};
        String key = "Guava";
        System.out.println("Index of " + key + " = "+Linear_search(fruits, key));
    }
}

















