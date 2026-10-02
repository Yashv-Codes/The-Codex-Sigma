public class practice{
    public static int lastoccurence(int arr[], int key, int i){
        if(i == arr.length)
            return -1;
        int isFound = lastoccurence(arr,key,i+1);
        if(isFound == -1 && arr[i] == key)
            return i;
        return isFound;
    }
    public static int power(int x, int n){
        if(n == 0)
            return 1;
        return x * power(x,n-1);
    }
    
    public static void main(String[] args){
        int arr[] = {8,6,9,5,10,2,5,3};
        System.out.println(power(3,5));
        
        
        
        
        
        
        
    }

}
 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

