public class Backtracking{

    // ARRAYS
    public static void Changearr(int arr[], int i, int val){
        if(i == arr.length){
            printarr(arr);
            return;
        }

        // Recursion
        arr[i] = val;
        Changearr(arr, i+1, val+1); 
        arr[i] -= 2; // Backtacking step
    }

    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = new int[5];
        Changearr(arr, 0, 1);
        printarr(arr);
    }

    // FIND SUBSETS
    public static void findsubsets(String str, int i, String ans){
        if(i == str.length()){
            if(ans.length() == 0){
                
            }
        }
    }
}

