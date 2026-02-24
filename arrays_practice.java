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
    public static int linear_search(int arr[], int key){
        int count = 0;
        for(int start=0; start<arr.length; start++){
            if(start==key){
                System.out.println("Key Found");
                count++;
            }
        }
        System.out.println("Key occured"+ count + "times");
        return -1;

    }
    public static void main(String[] args){
        int arr[] = {2,4,6,2,4,8};
        int key = 4;
        linear_search(arr,key);
        
    }
}






