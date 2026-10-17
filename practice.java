public class practice {

    public static boolean Knight_jump(int board[][], int row, int col, int move, int n){
        // Base Case
        if(move == n * n)
            return true;
        
        // All directions of knight moves
        int r[] = {2, 2, -2, -2, 1, 1, -1, -1};
        int c[] = {1, -1, 1, -1, -2, 2, 2, -2};

        // Check if valid/unvisited cell
        for(int i=0; i<8; i++){
            int nxtrow = row + 
        }


        

    }
    
    
    public static void main(String[] args){
        int n = 8;
        int board[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = -1;
            }
        }
        board[0][0] = 0;

    }
    
}
