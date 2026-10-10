public class Inversion_Count {
    public static int count(int arr[], int si, int ei){
        if(si < ei){
            int mid = si+(ei-si)/2;
             += count(arr,si,mid);
        }
            
        

    }
    
}
