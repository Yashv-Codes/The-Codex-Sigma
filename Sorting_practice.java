public class Sorting_practice {
    public static void Count_sort(int arr[]){
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
            int count[] = new int[largest+1];
            
            

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
        print_array(arr);
    }
}












    

