public class arrays_practice {
    public static void subarray(int arr[]){
        for(int start=0; start<1; start++){
            for(int end=start; end<arr.length; end++){
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int arr[] = {2,4,6,8};
        subarray(arr);
        
    }
}




