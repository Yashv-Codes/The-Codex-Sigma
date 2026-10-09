import java.util.Arrays;
public class practice{
    public static void sort(String[] arr, int si, int ei){
        if(si >= ei)
            return;
        int mid = si+(ei-si)/2;
        sort(arr, si, mid);
        sort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    public static void merge(String[] arr, int si, int mid, int ei){
        String temp[] = new String[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i <= mid && j <= ei){
            if(arr[i].compareTo(arr[j]))
        }
    }
    
    

    public static void main(String[] args){
        String arr[] = {"sun", "earth", "mars", "mercury"};
        

    }

}
    

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

