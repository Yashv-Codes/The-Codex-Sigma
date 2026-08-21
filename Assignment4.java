import java.util.*;
public class Assignment4 {
    public static int printcount(int matrix[][], int key){
        int count = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key)
                    count++;
                }
            }
            return count;
        }
        // To print sum of second row of matrix.
        public static int sumofrow(int matrix[][]){
            int sum = 0;
            for(int j=0; j<matrix[0].length; j++){
                sum += matrix[1][j];
            }
            return sum;
        }
        public static void main(String[] args){
            int matrix[][] = {{1,4,9}, {11,4,3}, {2,2,3}};
            // Scanner sc = new Scanner(System.in);
            // System.out.print("Enter key = ");
            // int key = sc.nextInt();
            // System.out.println("Key appeared: "+printcount(matrix,key));
            // sc.close();
            System.out.println("Sum of row = "+sumofrow(matrix));

        }
    }
    




