public class practice{
    public static int ways(int maze[][], int row, int col, int n){
        // Base Case
        if(row == n-1 && col == n-1)
            return 1;

        if(!isSafe(maze[row][col]))
            return 0;

        visited[row][col] == true;
        int up = ways(maze, row-1, col, n)
        
    }
    
        
    
    
    
    
    public static void main(String[] args){
        int maze[][] = { { 1, 0, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 0, 1, 0, 0 },
                         { 1, 1, 1, 1 } };
        int n = maze.length;

    
    }
}

    

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

