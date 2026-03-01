import java.util.Arrays;
import java.util.Collections;
public class Sorting_algorithms {
    public static void Bubble_sort(Integer arr[]){
        int n = arr.length;
        // Outer loop
        for(int turn=0; turn<n-1; turn++){
            // Inner loop
            for(int element=0; element<n-1-turn; element++){
                if(arr[element] > arr[element+1]){
                    // Swap
                    int temp = arr[element];
                    arr[element] = arr[element+1];
                    arr[element+1] = temp;
                }
            // Print after each pass
            System.out.println("After pass " + (turn+1) + ": " + Arrays.toString(arr));
        }
        System.out.println("Final Sorted Array: " + Arrays.toString(arr));
        System.out.println();
    }
}
    public static void Selection_sort(Integer arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){ // <n-1 because last element is automatically the largest.
            int min = i;
            for(int j=i+1; j<n; j++){
                if(arr[min]>arr[j])
                    min = j;
            }
            // Swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void Insertion_sort(Integer arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int curr = arr[i]; // stores temp.
            int prev = i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev]; // Shift to index of curr element.
                prev--;
            }
            // insertion
            arr[prev+1] = curr; // manual placing curr element to correct position.
        }
    }
    public static void printarr(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Integer arr[] = {1, 2, 3, 4, 5};
        // Arrays.sort(arr,0,4); // DIRECT SORTING 
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        printarr(arr);
    }
}


















    

