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
    

    public static void main(String[] args){
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        occurence(arr, 2, 0);
    }
}

    

