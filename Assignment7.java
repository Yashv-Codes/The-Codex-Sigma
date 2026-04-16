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

    public static void main(String[] args){
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // occurence(arr, 2, 0);
        printdigits(2011);
    }
}

    

