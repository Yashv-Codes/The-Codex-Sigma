public class Subarrays_sum {
    public static void prefix_subarray_sum(int arr[]){
        int prefix[] = new int[arr.length];
        // calculate prefix array
        for(int start=1; start<prefix.length; start++){
            prefix[start] = prefix[start-1] + arr[start];
        }
        // calculate from a specific index you want to
        int maxsum = Integer.MIN_VALUE;
        for(int start=0; start<arr.length; start++){
            for(int end=start; end<arr.length; end++){
                int currsum = 0;  
                      
                    
            }

        }
    }
    
}
