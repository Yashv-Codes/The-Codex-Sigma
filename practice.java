// import java.util.Arrays;
public class practice{
    public static int ways(int i, int j, int n, int m){
        if(i == n-1 && j == m-1)
            return
      
        int right = ways(i, j+1, n, m);
        int down = ways(i+1, j, n, m);
        return right + down;
    }
    
    public static void main(String[] args){
    
        
    }
}
    

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

