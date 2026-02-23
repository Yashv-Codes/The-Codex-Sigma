public class arrays_practice {
    public static void subarray(int arr[]){
        int end = arr.length-1; // index starts from 0 that's why len-1.
        for(int start=end; start>=0; start--){
            for(int k=start; k<=end; k++){
                System.out.print(arr[k]+ " ");
            }
            System.out.println();

        }
    }
    

    
    public static void main(String[] args){
        int arr[] = {2,4,6,8};
        subarray(arr);
        
    }
}



