import java.util.*;
public class practice {
    public static void search(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                largest = Math.max(largest, matrix[i][j]);
                smallest = Math.min(smallest, matrix[i][j]);
                
            }
        }
        System.out.println("Largest element = "+largest);
        System.out.println("Smallest element = "+smallest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // Output
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(search(matrix));

        sc.close();
        
        
        
        
        
        
        
        
        
    }
}

    

