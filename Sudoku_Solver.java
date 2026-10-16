public class Sudoku_Solver {

    // Check if digits are safe to place
    public static boolean isSafe(int sudoku[][], int row, int col, int digit){

        // Same Column
        for(int i=0; i<9; i++){
            if(sudoku[i][col] == digit)
                return false;
        }

        // Same Row
        for(int j=0; j<9; j++){
            if(sudoku[row][j] == digit)
                return false;
        }

        // Same Grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3; 
        for(int i=sr; i<sr+3; i++){ // 3 x 3 Grid
            for(int j=sc; j<sc+3; j++){
                if(sudoku[i][j] == digit)
                    return false;
  
            }
        }
    }
    // Placing digits
    public static boolean sudoku(int sudoku[][], int row, int col){
        // Base Case
        if(row == 9){
            print(sudoku);
            return true;
        }

        // Recursion
        int nxtrow = 0, nxtcol = col+1;
        if(col+1 == 9){
            nxtrow = row+1;
            nxtcol = 0;
        }

        // Current column is already full
        if(sudoku[row][col] != 0)
            return sudoku(sudoku, nxtrow, nxtcol);

        // Placing digits
        for(int digit=0; digit<=9; digit++){
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit;
                if(sudoku(sudoku, nxtrow, nxtcol)) // Solution exists
                    return true;
                sudoku[row][col] = 0; 
            }
        }
        return false;
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
