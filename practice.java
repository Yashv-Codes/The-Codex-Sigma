public class practice {

    public static void Knight_jump(int board[][], int row, int col, int move, int n){
        // Base Case
        if(move == n * n)

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
