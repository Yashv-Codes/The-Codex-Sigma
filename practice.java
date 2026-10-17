public class practice{
    public static int ways(int maze[][], int row, int col, int n, boolean[][] visited){
        // Base Case
        if(row < 0 || col < 0 || row == n || col == n)
            return 0;

        if(row == n-1 && col == n-1)
            return 1;

        if(!isSafe(maze[row][col]))
            return 0;

        visited[row][col] == true;

        int up = ways(maze, row-1, col, n);
        int down = ways(maze, row+1, col, n);
        int left = ways(maze, row, col-1, n);
        int right = ways(maze, row, col+1, n);

        visited[row][col] = false;

        return up + down + left + right;
        
    }
    
    public static void main(String[] args){
        int maze[][] = { { 1, 0, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 0, 1, 0, 0 },
                         { 1, 1, 1, 1 } };
        int n = maze.length;
        boolean[]

    
    }
}

    

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

