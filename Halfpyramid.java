public class Halfpyramid {
    public static void main(String args[]){
        int n =4;
        // for(int line=1; line<=n; line++){
        //     for(int num=1; num<=line; num++){
        //         System.out.print(num+" ");
        //     }
        //     System.out.println();
        // }
        
        // INVERTED AND ROTATED.
        int M = 3;
        for(int line=1; line<=n; line++){
            for(int space=1; space<=M; space++){
                System.out.print(" "+" ");
                M--;
            }
            for(int stars=1; stars<=line; stars++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}


 

        
        
        
       
    

