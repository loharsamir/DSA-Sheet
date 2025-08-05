public class MatrixOperations {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] B = {
            {7, 8, 9},
            {10, 11, 12}
        };

        int rows = A.length;
        int cols = A[0].length;

        int[][] sum = new int[rows][cols];
        int[][] diff = new int[rows][cols];
        int[][] mul = new int[rows][cols]; 

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                sum[i][j] = A[i][j] + B[i][j];
                diff[i][j] = A[i][j] - B[i][j];
            }

        int[][] BT = {
            {7, 10},
            {8, 11},
            {9, 12}
        };
        int[][] result = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    result[i][j] += A[i][k] * BT[k][j];
                }
            }
        }

        System.out.println("Matrix Addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(sum[i][j] + " ");
            System.out.println();
        }

        System.out.println("\nMatrix Subtraction:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(diff[i][j] + " ");
            System.out.println();
        }

        System.out.println("\nMatrix Multiplication (A x B^T):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }
    }
}