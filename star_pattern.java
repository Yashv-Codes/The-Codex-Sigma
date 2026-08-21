public class star_pattern{
    public static void main(String args[]){
        int n =5;
        // for(int line=1; line<=n; line++){
        //     for(int stars=1; stars<=line; stars++){
        //         System.out.print("*"+ " ");
        //     }
        //     System.out.println();
        // }
        
        // INVERTED STARS
        for(int line=1; line<=n; line++){
            for(int stars=5; stars>=line; stars--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        }
    }




    


