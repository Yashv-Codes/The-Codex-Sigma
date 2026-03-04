public class Spiral_Matrix {
    public static void printspiral(int matrix[][]){
        int srow = 0;
        int erow = matrix.length-1;
        int scol = 0;
        int ecol = matrix[0].length-1;

        while(srow<=erow && scol<=ecol){
            // Top part
            for(int j=scol; j<=ecol; j++){
                System.out.print(matrix[srow][j]+ " "); // j->column because going from scol->ecol.
            }
            // Right part
            for(int i=srow+1; i<=erow; i++){ 
                System.out.print(matrix[i][ecol]+" "); // i->row because going from srow->erow.
            }
            // Bottom part
            for(int j=ecol-1; j>=scol; j--){
                if(srow == erow)
                    break;
                System.out.print(matrix[erow][j]+" ");
            }
            // Left part
            for(int i=erow-1; i>=srow+1; i--){
                if(scol == ecol)
                    break;
                System.out.print(matrix[i][scol]+" ");
            }
            srow++;
            erow--;
            scol++;
            ecol--;
            System.out.println();
        }
    }
    public static void main(String[] args){
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8}, 
                          {9,10,11,12}, 
                          {13,14,15,16}};
        printspiral(matrix);
    } 
}







