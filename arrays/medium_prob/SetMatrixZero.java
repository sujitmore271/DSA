package arrays.medium_prob;
class SetMatrixZeroes {
    static void betterSetMatrix(int[][] matrix) {
        int n = matrix.length;       // Rows
        int m = matrix[0].length;    // Columns
        
        int[] rowMark = new int[n];
        int[] colMark = new int[m];

        // 1. Marking Phase
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    rowMark[i] = 1;
                    colMark[j] = 1; // Fixed: was rowMark[j]
                }
            }
        }

        // 2. Setting Zeros Phase
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (rowMark[i] == 1 || colMark[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
   
    public static void optimalSetMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int col0 = 1; // Tracker for the first column

        // Step 1: Traverse the matrix and mark 1st row/col
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    // Mark the i-th row
                    matrix[i][0] = 0;

                    // Mark the j-th column
                    if (j != 0)
                        matrix[0][j] = 0;
                    else
                        col0 = 0; // First column needs to be zeroed
                }
            }
        }

        // Step 2: Fill the matrix with zeros using the markers
        // (We skip the first row/col for now to avoid losing our "notes")
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Finally, handle the first row and first column
        if (matrix[0][0] == 0) {
            for (int j = 0; j < m; j++) matrix[0][j] = 0;
        }
        if (col0 == 0) {
            for (int i = 0; i < n; i++) matrix[i][0] = 0;
        }
    }


    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        optimalSetMatrix(matrix);
        
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
