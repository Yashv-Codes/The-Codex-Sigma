public class Subarrays_sum{
    public static void prefix_subarray_sum(int arr[]){
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        // calculate prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        // calculate max sum subarray
        int maxsum = Integer.MIN_VALUE;
        for(int start=3; start<arr.length; start++){
            for(int end=start; end<6; end++){
                int currsum = start==0? prefix[end] : prefix[end] - prefix[start-1]; 
                if(maxsum<currsum) 
                    maxsum = currsum;
                }
            }
        System.out.println("Maxsum = "+maxsum);
    }

    public static void main(String[] args){
    int arr[] = {2,4,6,8,10,15,67,13};
    prefix_subarray_sum(arr);
    }
}


    
    



