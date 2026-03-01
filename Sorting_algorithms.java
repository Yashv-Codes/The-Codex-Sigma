import java.util.Arrays;
public class Sorting_algorithms {
    public static void Bubble_sort(int arr[]){
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
    public static void Selection_sort(int arr[]){
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
    public static void Insertion_sort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int curr = i;
            int prev = i-1;
            while(prev>=0 && arr[prev]>arr[curr]){
                arr[prev+1] = arr[prev]; // Shift to index of curr element.
                prev--;
            }
            // insertion
            arr[prev+1] = arr[curr]; // manual placing curr element to correct position.
        }
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {5, 4, 1, 3, 2};
        Insertion_sort(arr);
        printarr(arr);
    }
}











    

