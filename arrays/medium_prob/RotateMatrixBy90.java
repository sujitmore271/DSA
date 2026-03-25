package arrays.medium_prob;
public class RotateMatrixBy90 {
    public static void rotate(int[][] matrix){
        int n = matrix.length;

        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j<n ; j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int k = 0 ; k < n ; k++){  
        int left = 0 ;
        int right = n-1;
        while (left < right) {
            int temp = matrix[k][left];
            matrix[k][left]= matrix[k][right];
            matrix[k][right]= temp;
            left++;
            right--;
            
        }
        }

    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
        
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
