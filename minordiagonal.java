import java.util.Scanner;

public class minordiagonal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns: ");
        int rows = scanner.nextInt();//3
        int columns = scanner.nextInt();//3

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int diagonalSum = getMinorDiagonalSum(matrix);

        System.out.println("Sum of minor diagonal elements: " + diagonalSum);
    }

    public static int getMinorDiagonalSum(int[][] matrix) {
        int diagonalSum = 0;
        int size = matrix.length;//rows=3

        for (int i = 0; i < size; i++) {
            diagonalSum += matrix[i][size - i - 1];//
        }

        return diagonalSum;
    }
}
