public class Subarrays_sum{
    public static void prefix_subarray_sum(int arr[]){
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        // calculate prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        // calculate specific index sum subarray
        int start = 3;
        int end = 6;
        int currsum = start==0? prefix[end] : prefix[end] - prefix[start-1]; 
        System.out.println("Sum = "+currsum);
    }

    public static void main(String[] args){
    int arr[] = {2,4,6,8,10,15,67,13};
    prefix_subarray_sum(arr);
    }
}




    
    



