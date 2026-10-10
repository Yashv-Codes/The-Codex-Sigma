public class Inversion_Count {
    public static int count(int arr[], int count, int si, int ei){
        if(si < ei){
            int mid = si+(ei-si)/2;
            count += count(arr,si,mid);
        }
            
        

    }
    
}
