import java.util.Scanner;
import java.util.Arrays;

public class colsum1 {
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
        
        int[] columnSums = getColumnSums(matrix);
        
        System.out.println("Column-wise sums: " + Arrays.toString(columnSums));
    }
    
    public static int[] getColumnSums(int[][] matrix) {
        int rows = matrix.length;//3
        int columns = matrix[0].length;//4
        
        int[] columnSums = new int[columns];//4
        
        for (int j = 0; j < columns; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][j];
            }
            columnSums[j] = sum;
        }
        
        return columnSums;
    }
}
