public class practice{
    
    public static boolean isSafe(int maze[][], int r, int c, boolean[][] visited){
        // Blocked Path
        if(maze[r][c] == 0)
            return false;

        if(visited[r][c])
            return false;

        return true;
    }

    public static int ways(int maze[][], int row, int col, int n, boolean[][] visited){
        // Base Case
        if(row < 0 || col < 0 || row == n || col == n)
            return 0;

        if(row == n-1 && col == n-1)
            return 1;

        if(!isSafe(maze, row, col, visited))
            return 0;

        visited[row][col] = true;

        int up = ways(maze, row-1, col, n, visited);
        int down = ways(maze, row+1, col, n, visited);
        int left = ways(maze, row, col-1, n, visited);
        int right = ways(maze, row, col+1, n, visited);

        visited[row][col] = false;

        return up + down + left + right;
        
    }
    
    public static void main(String[] args){
        int maze[][] = { { 1, 0, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 0, 1, 0, 0 },
                         { 1, 1, 1, 1 } };
        int n = maze.length;
        boolean[][] visited = new boolean[n][n];
        // Edge Case 
        if(maze[0][0] == 0 || maze[n-1][n-1] == 0){
            System.out.println("No paths");
        }
        else{
            System.out.println("Total paths = "+ways(maze,0,0,n,visited));
        }
    }
}

    

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

