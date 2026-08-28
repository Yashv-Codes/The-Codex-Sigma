public class Hollowrectangle{
    public static void main(String args[]){
        int n = 4;
        for(int line=1; line<=n; line++){
            for(int stars=1; stars<=n+1; stars++){
                if( line==1 || line==n || stars==1 || stars==n+1)
                    System.out.print("*"+" ");
                else
                    System.out.print(" "+" ");
            }  
            System.out.println(); 
        }
    }
}



