// import java.util.Arrays;
public class practice{
    public static int ways(int i, int j, int n, int m){
      
        int right = ways(i, j+1, n, m);
        int down = ways(i+1, j, n, m);
        return right + down;
    }
    
    public static void main(String[] args){
    
        
    }
}
    

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

