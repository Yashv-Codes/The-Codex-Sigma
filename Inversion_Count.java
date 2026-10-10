public class Inversion_Count {
    public static int count(int arr[], int si, int ei){
        if(si < ei){
            int mid = si+(ei-si)/2;
            int left_count = count(arr,si,mid);
            int right_count = count(arr,mid+1,ei);
            int inv_count = merge(arr,si,mid,ei);
            return left_count + right_count + inv_count;
        }
    }
    
}
