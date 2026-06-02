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
    
    
    // Placing Queens
    public static boolean nQueens(char board[][], int row){
        if(row == board.length){
            // printBoard(board);
            count++;
            return true;
        }
        // Column loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(nQueens(board, row+1))
                    return true;
                }
                board[row][j] = '.'; // Backtracking step
            }
            return false;
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

    static int count = 0;
    
    public static void main(String[] args){
        int n = 4;
        char board[][] = new char[n][n];
        // Initialization
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        if(nQueens(board, 0)){
            System.out.println("Solution exists.");
            printBoard(board);
        }
        else
            System.out.println("Solution doesn't exist");
        System.out.println("Total ways to place N-Queen's are: "+count);
    }
}





