import java.util.*;
public class TwoD_arrays_basics{
    public static void searchkey(int matrix[][]){
        int lrow = 0, lcol = 0;
        int srow = 0, scol = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(largest<matrix[i][j]){
                    largest = matrix[i][j];
                    lrow = i;
                    lcol = j;
                }

                if(smallest>matrix[i][j]){
                    smallest = matrix[i][j];
                    srow = i;
                    scol = j;
                }
            }
        }
        System.out.println("Largest no = "+largest);
        System.out.println("Found at cell (" + lrow +"," + lcol +")");
        System.out.println("Smallest no = "+smallest);
        System.out.println("Found at cell (" + srow +"," + scol +")");
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










