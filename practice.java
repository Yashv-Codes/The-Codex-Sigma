// import java.util.Arrays;
public class practice{
    public static boolean isSafe(int maze[][], int x, int y){
        for(int i=x; i<maze.length; i++){
            for(int j=y; j<maze.length; j++){
                if(maze[x][y] == 0)
                    return false;
            }
        }
        return true;
    }
    public static int ways(int maze[][], int x, int y){
        if(x == maze.length-1 && y == maze.length-1)
            return 1;
        else if(x == maze.length || y == maze.length)
            return 0;
        if(isSafe(maze, x, y)){
            int up = ways(maze, x, y-1);
            int down = ways(maze, x, y+1);
            int left = ways(maze, x-1, y);
            int right = ways(maze, x+1, y);
            return up + down + left + right;
        }
    }
    
    
    
    public static void main(String[] args){
        int maze[][] = { { 1, 0, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 0, 1, 0, 0 },
                         { 1, 1, 1, 1 } };

    
    }
}
    

 




        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

