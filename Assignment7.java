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
    public static void printsubstr(String str, int start, int end){
        if(start == str.length())
            return;

        // Inner loop
        if(end > str.length()){
            printsubstr(str, start+1, start+1);
            return;
        }
        // Print current substring
        System.out.println(str.substring(start,end));

        // Outer loop
        printsubstr(str, start, end+1);
    }

    public static void main(String[] args){
        String str = "hello";
        // int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // occurence(arr, 2, 0);
        // printdigits(2011);
        // System.out.println("total length = "+findlength("hello"));
        printsubstr(str, 0, 1);
        
    }
}








    

