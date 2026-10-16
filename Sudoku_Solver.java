public class Sudoku_Solver {
    // Placing digits
    public static void sudoku(int sudoku[][], int row, int col){
        // Base Case
        if(row == 9){
            print(sudoku);
            return;
        }

        int nxtrow = 0, nxtcol = col+1;
        if(col+1 == 9){
            nxtrow = row+1;
            nxtcol = 0;
        }
        // No place to 
        if(sudoku[row][col] != 0)
            return sudoku(sudoku, nxtrow, nxtcol);



    }
    public static void print(int sudoku[][]){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int sudoku[][] = {{0,0,8,0,0,0,0,0,0},
                         {4,9,0,1,5,7,0,0,2},
                         {0,0,3,0,0,4,1,9,0},
                         {1,8,5,0,6,0,0,2,0},
                         {0,0,0,0,2,0,0,6,0},
                         {9,6,0,4,0,5,3,0,0},
                         {0,3,0,0,7,2,0,0,4},
                         {0,4,9,0,3,0,0,5,7},
                         {8,2,7,0,0,9,0,1,3}};
    }
}
