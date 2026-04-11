public class MergeSort {
    public static void sort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si+(ei-si)/2;

        // Left part
        sort(arr, si, mid);

        // Right part
        sort(arr, mid+1, ei);

        merge(arr, si, mid, ei);
    }
    
    // Method to merge the sorted parts
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si; // 

    }
    
}
