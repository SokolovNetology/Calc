package times1;
import java.util.Random;
public class Matrix {
    final static int SIZE = 16;

    public static void main(String[] args) {
        int[][] originalMatrix = createMatrix(SIZE);
        System.out.println("Оригинальная матрица");
        printMatrix(originalMatrix);
        int[][] rotateMatrix = rotateMatrix(originalMatrix);
        System.out.println("Перевернутая матрица");
        printMatrix(rotateMatrix);
    }
    private static int[][] rotateMatrix(int[][] originalMatrix) {
        int size = originalMatrix.length;
        int [][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = originalMatrix[size - 1 - j][i];
            }

        }
        return result;
    }
    private static int[][] createMatrix(int size) {

        Random random = new Random();
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = random.nextInt(256);
            }
        }
            return result;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%4d ", matrix[i][j]);
            }
            System.out.println();
        }
         System.out.println();
    }


}