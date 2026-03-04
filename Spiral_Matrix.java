public class Spiral_Matrix {
    public static void printspiral(int matrix[][]){
        int srow = 0;
        int erow = matrix.length-1;
        int scol = 0;
        int ecol = matrix[0].length-1;

        while(srow<=erow && scol<=ecol){
            // Top part
            for(int j=scol; j<=ecol; j++){
                System.out.print(matrix[srow][j]);
            }
            // Right part
            
        }


    }
    public static void main(String[] args){
        int matrix[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

    } 
    
}
