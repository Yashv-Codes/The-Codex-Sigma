public class N_QUEENS {

    // CHECK IF QUEEN IS SAFE TO PLACE
    public static boolean isSafe(char board[][], int row, int col){
        // Vertical up
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q')
                return false;
        }

        // Diagonal left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q')
                return false;
        }

        // Diagonal right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q')
                return false;
        }
        return true;
    }
    
    
    // Placing Quuens
    public static void nQueens(char board[][], int row){
        if(row == board.length){
            printBoard(board);
            return;
        }
        // Column loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueens(board, row+1);
                board[row][j] = '.'; // Backtracking step
            }
        }
    }

    // Printing Board
    public static void printBoard(char board[][]){
        System.out.println("------CHESS BOARD------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        int n = 4;
        char board[][] = new char[n][n];
        // Initialization
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        nQueens(board, 0);
    }
}



