public class Arrays {
    public static void reverse_array(int arr[]){
        int first = 0;
        int last = arr.length-1;
        while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }
    public static void Subarrays(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print( + arr[k] + " ");
                    count++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays = "+count);

    }
    public static void pairs(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = "+count);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        // reverse_array(arr);
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+ " ");
        // }
        // pairs(arr);
        Subarrays(arr);
    }
}







