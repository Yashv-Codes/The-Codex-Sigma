public class Subarrays_sum{
    public static void Max_subarrays_sum(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        for(int start=0; start<arr.length; start++){
            for(int end=start; end<arr.length; end++){
                int sum = 0;
                for(int k=start; k<=end; k++){
                    sum += arr[k];
                }
                System.out.println(sum);
                if(maxsum<sum)
                    maxsum = sum;
            }
        }
        System.out.println("Maxsum = "+maxsum);
    }

    public static void Kadanes_algo(int arr[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int start=0; start<arr.length; start++){
            currsum += arr[start];
            if(currsum<0)
                currsum = 0;
            maxsum = Math.max(currsum, maxsum);
        }
        System.out.println("Max sum = "+ maxsum);
    }

    public static void prefix_subarray_sum(int arr[]){
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        // calculate prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i]; // store in prefix array for later use.
        }
        // calculate specific index sum subarray
        int start = 3;
        int end = 6;
        int currsum = start==0? prefix[end] : prefix[end] - prefix[start-1]; 
        System.out.println("Sum = "+currsum);
    }

    public static void main(String[] args){
    int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
    // prefix_subarray_sum(arr);
    Kadanes_algo(arr);
}
}









    
    



