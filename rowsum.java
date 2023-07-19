import java.util.Scanner;
import java.util.Arrays;

public class rowsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        
        int[][] matrix = new int[rows][columns];
        
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        int[] rowSums = getRowSums(matrix);
        
        System.out.println("Row-wise sums: " + Arrays.toString(rowSums));
    }
    
    public static int[] getRowSums(int[][] matrix) {
        int rows = matrix.length;//3
        int columns = matrix[0].length;//4
        
        int[] rowSums = new int[rows];//4
        
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < columns; j++) {
                sum += matrix[i][j];
            }
            rowSums[i] = sum;
        }
        
        return rowSums;
    }
}

