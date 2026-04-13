public class QuickSort {
    public static void Sort(int arr[], int si, int ei){
        if(si>= ei)
            return;

        // Last element
        int pIdx = partition(arr, si, ei);
        Sort(arr, si, pIdx-1); // Left 
        Sort(arr, pIdx+1, ei); // Right
    }
    
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1; // to make place for els smaller than pivot

        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                // Swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // Place pivot at correct position
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = {6, 3, 9, 8, 2, 5};
        Sort(arr, 0, arr.length-1);
        printarr(arr);
    }
}

