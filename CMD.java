package programs;

class CMD {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java MatrixAddition <order>");
            System.exit(1);
        }
        int order = Integer.parseInt(args[0]);
        int[][] matrix1 = generateRandomMatrix(order);
        int[][] matrix2 = generateRandomMatrix(order);
        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        System.out.println("Matrix 2:");
        printMatrix(matrix2);
        int[][] resultMatrix = addMatrices(matrix1, matrix2);
        System.out.println("Result Matrix:");
        printMatrix(resultMatrix);
    }

    // Generates a random matrix of given order
    private static int[][] generateRandomMatrix(int order) {
        int[][] matrix = new int[order][order];
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                matrix[i][j] = (int) (Math.random() * 10); // Generate random

            }
        }
        return matrix;
    }

    // Adds two matrices
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int order = matrix1.length;
        int[][] resultMatrix = new int[order][order];
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return resultMatrix;
    }

    // Prints a matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}