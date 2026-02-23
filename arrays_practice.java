public class arrays_practice {
    public static void subarrays(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            System.out.println("(" + arr[i] + "," + arr[i+1] + ") ");
            }
        }
    public static void fixed_subarray(int arr[]){
        
    }
    
    public static void main(String[] args){
        int arr[] = {2,4,6,8,10};
        subarrays(arr);
    }
    
}

