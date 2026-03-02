public class Sorting_practice {
    public static void Bubble_sort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void Selection_sort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            
        }
    }
    public static void Insertion_sort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int curr = arr[i];
            int prev = i-1;

        }
    }
    public static void print_array(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        Selection_sort(arr);
        print_array(arr);
    }
}











    

