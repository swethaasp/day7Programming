
import java.util.Scanner;

public class AntiDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[][] antiDiagonals = getAntiDiagonals(matrix, n);

        System.out.println("Anti-Diagonals:");
        for (int i = 0; i < antiDiagonals.length; i++) {
            for (int j = 0; j < antiDiagonals[i].length; j++) {
                System.out.print(antiDiagonals[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getAntiDiagonals(int[][] matrix, int n) {
        int[][] antiDiagonals = new int[2 * n - 1][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                antiDiagonals[i][j] = matrix[j][i - j];
                antiDiagonals[n + i][j] = matrix[n - j - 1][n - i + j - 1];


            }
        }

        return antiDiagonals;
    }
}
