import java.util.Arrays;
public class practice{
    public static void n_queen(char board[][], int row){
        if(row == board.length){
            System.out.println(Arrays.deepToString(board));
            return;
        }
        for(int j=0; j<board.length; j++){
            board[row][j] = 'Q';
            n_queen(board,row+1);
            board[row][j] = '.';
        }
    }
    public static boolean isSafe(char board[][], int row, int col){
        for(int i=row-1; row>=0; row--){
            if(board[i][col] == 'Q')
                return false;
        }
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q')
                return false;
        }
        for(int i=row-1, j=col+1; i>=0 && j<)

    }
    
    
    public static void main(String[] args){
        int n = 5;
        char board[][] = new char[n][n];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j] = '.';
            }
        }
        
    }
}
    

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

