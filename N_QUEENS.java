public class N_QUEENS {

    public static void nQueens(char board[][], int row){
        // Column loop
        for(int j=0; j<board.length; j++){
            
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
