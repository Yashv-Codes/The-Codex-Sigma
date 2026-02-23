public class prac {
    public static void subarrays(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println("(" + arr[i] + "," + arr[i+1] + ") ");
            }
            System.out.println();
        }
    
    public static void main(String[] args){
        int arr[] = {2,4,6,8,10};
        subarrays(arr);
    }
    
}
