public class Inversion_Count {
    public static int count(int arr[], int si, int ei){
        if(si < ei){
            int mid = si+(ei-si)/2;
            int left_count = count(arr,si,mid);
            int right_count = count(arr,mid+1,ei);
            int inv_count = merge(arr,si,mid,ei);
            return left_count + right_count + inv_count;
        }
        return 0;
    }
    public static int merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int inversion = 0, i = si, j = mid+1, k = 0;
        while(i <= mid && j <= ei){
            if(arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else{
                inversion += (mid-i+1);
                temp[k++] = arr[j++];
            }
        }
        while(i <= mid)
        

    }
}
