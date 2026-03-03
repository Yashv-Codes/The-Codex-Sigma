import java.util.*;
public class TwoD_arrays_basics{
    public static boolean searchkey(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(largest<matrix[i][j]){
                    largest = matrix[i][j];
                    System.out.println("Largest no = "+matrix[i][j]);
                    System.out.println("Found at cell (" + i +"," + j +")");
                    return true;
                }

                if(smallest>matrix[i][j]){
                    smallest = matrix[i][j];
                    System.out.println("Smallest no = "+matrix[i][j]);
                    System.out.println("Found at cell (" + i +"," + j +")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        // INPUT
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print("Enter a no: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        // OUTPUT
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
        searchkey(matrix);
    }
}









