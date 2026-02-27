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
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("New Sorted Array: "+arr);
    }
    public static void main(String[] args){
        int arr[] = {5, 4, 1, 3, 2};
        Bubble_sort(arr);
    }
}



    

