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
        String str = "abc";
        // Changearr(arr, 0, 1);
        // printarr(arr);
        // findsubsets(str, "", 0);
        findpermutation(str, "");
    }

    // FIND SUBSETS
    public static void findsubsets(String str, String ans, int i){
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.print("Empty");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        // Yes choice
        findsubsets(str, ans+str.charAt(i), i+1);

        // No choice
        findsubsets(str, ans, i+1);
    }

    // FIND PERMUTATIONS
    public static void findpermutation(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        // Recursion
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String NewStr = str.substring(0,i) + str.substring(i+1);
            findpermutation(NewStr, ans+curr);
        }
    }
}





