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
    public static int Largest_num(int num[]){
        int largest = Integer.MIN_VALUE; // stores -infinity value
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<num.length; i++){
            if(smallest>num[i])
                smallest = num[i];
            }
        return smallest;
    }
    public static int Binary_search(int num[], int key){
        int start = 0;
        int end = num.length-1;
        
        while(start<=end){
            int mid = (start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            else if(num[mid]>key){
                end = mid-1;
            }
            else{
                start = mid+1;
            } 
        }
        return -1;
    }
    public static void main(String args[]){
        int num[]= {1, 2, 3, 4, 24,56,78};
        int key = 56;
        // String fruits[]= {"Apple", "Mango", "Banana", "Guava"};
        // System.out.println("smallest num = "+Largest_num(num));
        System.out.println("Index of key = "+Binary_search(num,key));

    }
}




















