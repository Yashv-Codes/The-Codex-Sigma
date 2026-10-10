public class Inversion_Count {
    public static int count(int arr[], int si, int ei){
        int left_count = 0, right_count = 0;
        if(si < ei){
            int mid = si+(ei-si)/2;
            int left_count += count(arr,si,mid);
        }
            
        

    }
    
}
