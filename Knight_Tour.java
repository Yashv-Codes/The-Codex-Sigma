public class Knight_Tour {

    public static boolean isSafe(int board[][], int row, int col, int n){
        // Boundary Condition
        if(row < 0 || row >= n || col < 0 || col >= n)
            return false;

        // Already Visited
        if(board[row][col] != -1)
            return false;

        return true;
    }

    public static boolean Knight_jump(int board[][], int row, int col, int move, int n){
        // Base Case
        if(move == n * n)
            return true;
        
        // All directions a knight can move
        int r[] = {2, 2, -2, -2, 1, 1, -1, -1};
        int c[] = {1, -1, 1, -1, -2, 2, 2, -2};

        // Check if valid/unvisited cell
        for(int i=0; i<8; i++){
            int nxtrow = row + r[i];
            int nxtcol = col + c[i];

            if(isSafe(board, nxtrow, nxtcol, n)){
                // Mark visited
                board[nxtrow][nxtcol] = move;

                if(Knight_jump(board, nxtrow, nxtcol, move+1, n)) // Solution exists
                    return true;

                board[nxtrow][nxtcol] = -1; // Backtracking step
            }
        }
        return false;
    }

    public static void printboard(int board[][], int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args){
        int n = 5;
        int board[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = -1;
            }
        }
        board[0][0] = 0;

        if(Knight_jump(board, 0, 0, 1, n)){
            System.out.println("-----Solution Exists-----");
            printboard(board, n);
        }
        else
            System.out.println("Solution doesnt exists");
    }
}


