public class Assignment7{
    // Calculate all occurences
    public static void occurence(int arr[], int key, int i){
        if(i == arr.length)
            return;

        if(arr[i] == key)
            System.out.print(i + " ");
        
        occurence(arr, key, i+1);
    }

    // Convert digits to String
    public static void printdigits(int n){
        if(n == 0)
            return;
        String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int lastdigit = n%10;
        printdigits(n/10);
        System.out.print(digits[lastdigit]+" ");
    }

    // Length of a string
    public static int findlength(String str){
        if(str.length() == 0)
            return 0;

        return 1 + findlength(str.substring(1));
    }

    // Substring starting/ending with same character
    public static void printsubstring(String str){
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length(); j++){
                System.out.println(str.substring(i,j));
            }
        }
    }

    public static void main(String[] args){
        String str = "hello";
        // int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // occurence(arr, 2, 0);
        // printdigits(2011);
        // System.out.println("total length = "+findlength("hello"));
        printsubstring(str);
    }
}




    

